/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogit;

/**
 *
 * @author ee791163
 */
public class DemoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Wrong args");
            System.exit(1);
        }
        
        System.out.println("Hello " + args[0] + "!");
        System.out.println("Hello " + args[0] + "!");
    }
    
}
