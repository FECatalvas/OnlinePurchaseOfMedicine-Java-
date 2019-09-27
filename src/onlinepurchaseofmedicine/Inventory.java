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

    private ArrayList<Medicine> inven;

    public void InventoryBodyPain() {
        inven = new ArrayList();
        inven.add(new BodyPainMedicine("Ibuprofen", "Advil", 15));
        inven.add(new BodyPainMedicine("Ibuprofen", "Alaxan", 0));
        inven.add(new BodyPainMedicine("Ibuprofen", "Medicol", 0));
    }

    public void InventoryCough() {
        inven.add(new CoughMedicine("Lagundi", "Ascof", 12));
        inven.add(new CoughMedicine("Butamirate", "Sinecod", 12));
        inven.add(new CoughMedicine("Ambroxol", "Ambrolex", 12));

    }

    public void InventoryAllergy() {
        inven.add(new AllergyMedicine("Loratadine", "Allerta", 213));
        inven.add(new AllergyMedicine("Loratadine", "Claritin", 213));
        inven.add(new AllergyMedicine("Mometasone", "Elica", 213));

    }

    public void InventoryHeadache() {
        inven.add(new HeadacheMedicine("Paracetamol", "Biogesic", 12));
        inven.add(new HeadacheMedicine("Paracetamol Caffeine", "Rexidol", 12));
        inven.add(new HeadacheMedicine("Paracetamol", "Panadol", 12));
    }

    public void displayMed() {
        Iterator<Medicine> itr = inven.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public class CoughMedicine extends Medicine {

        public CoughMedicine() {
        }

        public CoughMedicine(String brandName, String genericName, int price) {
            super(brandName, genericName, price);
        }

    }

    public class BodyPainMedicine extends Medicine {

        public BodyPainMedicine() {
        }

        public BodyPainMedicine(String brandName, String genericName, int price) {
            super(brandName, genericName, price);
        }

    }

    public class AllergyMedicine extends Medicine {

        public AllergyMedicine() {
        }

        public AllergyMedicine(String brandName, String genericName, int price) {
            super(brandName, genericName, price);
        }

    }

    public class HeadacheMedicine extends Medicine {

        public HeadacheMedicine() {
        }

        public HeadacheMedicine(String brandName, String genericName, int price) {
            super(brandName, genericName, price);
        }

    }
}
