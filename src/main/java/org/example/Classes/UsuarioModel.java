package org.example.Classes;

public class UsuarioModel {

    //Creación de los atributos de la clase
    private Integer id_doc;
    private String doc_type;
    private String name;
    private String lastName;
    private String email;
    private String program;

    public UsuarioModel() {
    }

    public UsuarioModel(Integer id_doc, String doc_type, String name, String lastName, String email, String program) {
        this.id_doc = id_doc;
        this.doc_type = doc_type;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.program = program;
    }

    public Integer getId_doc() {
        return id_doc;
    }

    public void setId_doc(Integer id_doc) {
        this.id_doc = id_doc;
    }

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
