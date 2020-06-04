/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.lang.Exception;

/**
 *
 * @author os_conght
 */
public class ForeignStudent implements InfStudy 
//InfAdvancedStudy
{

    private int IELTS_mark;
    private String Visa;

    public boolean isQualifyForEnglish() {
        return this.getIELTS_mark() > 8.0;
    }

    public int getIELTS_mark() {
        return IELTS_mark;
    }

    public void setIELTS_mark(int IELTS_mark) {
        this.IELTS_mark = IELTS_mark;
    }

    public String getVisa() {
        return Visa;
    }

    public void setVisa(String Visa) {
        this.Visa = Visa;
    }

    // do something 
    public int runForSecretary() throws Exception {
        throw new Exception();
    }

    @Override
    public void studyFrench() {
        System.out.println("Có học môn này");
    }

    @Override
    public void studyEnglish() {
        System.out.println("Có học môn này");
    }

    @Override
    public void studyMath() {
        System.out.println("Có học môn này");
    }
}
