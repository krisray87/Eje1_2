package com.example.eje1_2.tablas;

public class Transacciones {

    public static final String NameDatabase = "Eje1_3";


    public static final String TbPersonas = "personas";


    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String correo = "correo";
    public static final String direccion = "direccion";


    public static final String CTPersonas = "CREATE TABLE personas (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            " nombres TEXT, apellidos TEXT, edad INTEGER, correo TEXT, direccion TEXT)";

    public static final String GetPersonas = "SELECT * FROm " + Transacciones.TbPersonas;

    public static final String UpPersonas = "UPDATE "+Transacciones.TbPersonas+" SET `nombres`="+Transacciones.nombres+",`apellidos`="+Transacciones.apellidos+",`edad`='[value-4]',`edad`="+Transacciones.edad+",`correo`="+Transacciones.correo+",`direccion`=`direccion`="+Transacciones.direccion+" WHERE id= "+Transacciones.id;

    public static final String DropTPersona = "DROP TABLE IF EXISTS personas";

}
