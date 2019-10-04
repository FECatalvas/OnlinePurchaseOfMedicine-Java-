/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

import java.util.*;

/**
 *
 * @author 2ndyrGroupB
 */
public class Inventory {

    private ArrayList<Medicine> inventForBodyPain = new ArrayList();
    private ArrayList<Medicine> inventForCough = new ArrayList();
    private ArrayList<Medicine> inventForAllergy = new ArrayList();
    private ArrayList<Medicine> inventForHeadache = new ArrayList();

    public void InventoryBodyPain() {
        inventForBodyPain.add(new BodyPainMedicine("Ibuprofen", "Advil", 12));
        inventForBodyPain.add(new BodyPainMedicine("Ibuprofen", "Alaxan", 12));
        inventForBodyPain.add(new BodyPainMedicine("Ibuprofen", "Medicol", 12));
        Iterator itrPain = inventForBodyPain.iterator();
        System.out.println("\t===============LIST OF BODY PAIN MEDICINE================");
        while (itrPain.hasNext()) {
            System.out.println(itrPain.next());
        }
        System.out.println();
    }

    public void InventoryCough() {
        inventForCough.add(new CoughMedicine("Lagundi", "Ascof", 12));
        inventForCough.add(new CoughMedicine("Butamirate", "Sinecod", 12));
        inventForCough.add(new CoughMedicine("Ambroxol", "Ambrolex", 12));
        Iterator itrCough = inventForCough.iterator();
        System.out.println("\t===============LIST OF COUGH MEDICINE================");
        while (itrCough.hasNext()) {
            System.out.println(itrCough.next());
        }
        System.out.println();
    }

    public void InventoryAllergy() {
        inventForAllergy.add(new AllergyMedicine("Loratadine", "Allerta", 12));
        inventForAllergy.add(new AllergyMedicine("Loratadine", "Claritin", 12));
        inventForAllergy.add(new AllergyMedicine("Mometasone", "Elica", 12));
        Iterator itrAllergy = inventForAllergy.iterator();
        System.out.println("\t===============LIST OF ALLERGY MEDICINE================");
        while (itrAllergy.hasNext()) {
            System.out.println(itrAllergy.next());
        }
        System.out.println();
    }

    public void InventoryHeadache() {
        inventForHeadache.add(new HeadacheMedicine("Paracetamol", "Biogesic", 12));
        inventForHeadache.add(new HeadacheMedicine("Paracetamol Caffeine", "Rexidol", 12));
        inventForHeadache.add(new HeadacheMedicine("Paracetamol", "Panadol", 12));
        Iterator itrHeadache = inventForHeadache.iterator();
        System.out.println("\t===============LIST OF HEADACHE MEDICINE================");
        while (itrHeadache.hasNext()) {
            System.out.println(itrHeadache.next());
        }
        System.out.println();
    }
}

