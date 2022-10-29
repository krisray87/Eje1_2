package com.example.eje1_2.tablas;


    public class Personas
    {
        public Integer id;
        public String nombres;
        public String apellidos;
        public Integer edad;
        public String correo;
        public String direccion;



        // Constructor de clase
        public Personas()
        {
            //Todo
        }

        public Personas(Integer id, String nombres, String apellidos, Integer edad, String correo) {
            this.id = id;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.edad = edad;
            this.correo = correo;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

