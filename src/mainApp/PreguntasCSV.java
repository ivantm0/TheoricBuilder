/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

/**
 *
 * @author ivant
 */
public class PreguntasCSV {
    private String pregunta, correcta, incorrecta1, incorrecta2, incorrecta3;
    
    PreguntasCSV(String pregunta, String correcta, String incorrecta1, String incorrecta2, String incorrecta3){
        this.pregunta = pregunta;
        this.correcta = correcta;
        this.incorrecta1 = incorrecta1;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public void setIncorrecta1(String incorrecta1) {
        this.incorrecta1 = incorrecta1;
    }

    public void setIncorrecta2(String incorrecta2) {
        this.incorrecta2 = incorrecta2;
    }

    public void setIncorrecta3(String incorrecta3) {
        this.incorrecta3 = incorrecta3;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getCorrecta() {
        return correcta;
    }

    public String getIncorrecta1() {
        return incorrecta1;
    }

    public String getIncorrecta2() {
        return incorrecta2;
    }

    public String getIncorrecta3() {
        return incorrecta3;
    }
}
