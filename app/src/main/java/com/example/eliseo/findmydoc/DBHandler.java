package com.example.eliseo.findmydoc;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;


/**
 * Created by eliseo on 31-08-16.
 */
class usuariodbhelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "FMDDB.db";
    private static final String TABLA_USUARIOS = "usuarios";

    public static final String rut = "rut";
    public static final String nombre = "nombre";
    public static final String apellido = "apellido";
    public static final String pass = "pass";
    public static final String correo = "correo";

    public usuariodbhelper(Registrarse context, String name,
                           SQLiteDatabase.CursorFactory factory, int version) {
        super((Context) context, DATABASE_NAME, factory, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
            String create_table_usuarios = "CREATE TABLE " + TABLA_USUARIOS + "(" + rut + "TEXT PRIMARY KEY,"
                + nombre + "TEXT," + apellido + "TEXT," + pass + "TEXT," + correo + "TEXT" + ")";
        db.execSQL(create_table_usuarios);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
    }
    public void addUser(usuario user) {

        ContentValues values = new ContentValues();
        values.put(rut, user.getRut());
        values.put(nombre,user.getApellido());
        values.put(apellido, user.getNombre());
        values.put(pass,user.getPass());
        values.put(correo,user.getCorreo());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLA_USUARIOS, null, values);
        db.close();
    }
    public usuario findUser(String productname) {
        String query = "Select * FROM " + TABLA_USUARIOS + " WHERE " + rut + " =  \"" + rut + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        usuario user = new usuario();
        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            user.setRut(cursor.getString(0));
            user.setNombre(cursor.getString(1));
            user.setApellido(cursor.getString(2));
            user.setApellido(cursor.getString(3));
            user.setPass(cursor.getString(4));
            user.setCorreo(cursor.getString(5));
            cursor.close();
        } else {
            user = null;
        }
        db.close();
        return user;
    }

}
