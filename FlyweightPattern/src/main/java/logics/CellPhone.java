/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logics;

/**
 *
 * @author truqu
 */
// Esatado unico para cada celular (extrinseco)
public class CellPhone {
    private String ram;
    private String storage;
    private String camera;
    private CellPhoneModel phoneModel;
    
    public CellPhone(String ram, String storage, String camera, CellPhoneModel phoneModel) {
        this.ram = ram;
        this.storage = storage;
        this.camera = camera;
        this.phoneModel = phoneModel;
    }
    
    public String display(){
        return phoneModel.display();
    };

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getCamera() {
        return camera;
    }

    public CellPhoneModel getPhoneModel() {
        return phoneModel;
    }
    
    
}