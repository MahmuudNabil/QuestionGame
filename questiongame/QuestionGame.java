/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questiongame;

import javax.swing.JFrame;

/**
 *
 * @author Mahmoud
 */
public class QuestionGame {
             public static int x = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Start st = new Start();
        st.setTitle("مرحبا بك فى السؤال الاول");
        st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        st.setLocationRelativeTo(null);
        st.setVisible(true);
        
        
    }
    
}
