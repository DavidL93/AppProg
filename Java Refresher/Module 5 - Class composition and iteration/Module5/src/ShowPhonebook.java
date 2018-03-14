/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class ShowPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook("Sam Johnson");
        phonebook.addContact(new Contact("Kelly Wong", "(02) 12345678"));
        phonebook.addContact(new Contact("Richard Jackson", "(02) 87654321"));
        phonebook.show();
    }
}
