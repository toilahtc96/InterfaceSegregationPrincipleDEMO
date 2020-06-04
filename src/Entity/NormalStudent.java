/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author os_conght
 */
public class NormalStudent implements InfStudy {
    //InfCommonStudy

    public int runForSecretary() {
        // do something 
        return 2;
    }

    @Override
    public void studyEnglish() {
        System.out.println("Có học môn này");
    }

    @Override
    public void studyMath() {
        System.out.println("Có học môn này");
    }

    @Override
    public void studyFrench() {
        System.out.println("Không học môn này");
    }
}
