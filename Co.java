package PHONEBOOK;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


import javax.swing.JFrame;

class contact
{

    String Name, Ct_No;

    public void setName(String name) 
    {
        this.Name = name;
    }

    public void setNo(String cno) 
    {
        this.Ct_No = cno;
    }

    public String getName() 
    {
        return Name;
    }

    public String getNo() 
    {
        return Ct_No;
    }

    public String toString() 
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append(Name);
        return buffer.toString();
    }
}
class AddContact  extends MouseAdapter implements ActionListener
{
	

    JFrame jf_AddContact, jf_ViewContact;
    JTextField txt_name, txt_cno;
    JLabel lbl_name, lbl_cno, name, no, lbl_ct;
    JButton btn_add;
    JList jl_contact;
    JScrollPane scroll;
    DefaultListModel dlm_contact;
    
    //Collection Variable

    public AddContact() 
    {
        txt_name = new JTextField();
        txt_cno = new JTextField();
        lbl_name = new JLabel("Enter Name:");
        lbl_cno = new JLabel("Enter Contact No:");
        lbl_ct = new JLabel("Contacts:");
        btn_add = new JButton("Add");
        jl_contact = new JList();
        jl_contact.addMouseListener(this);
        dlm_contact = new DefaultListModel();
       
	//Collection Initialization

        btn_add.addActionListener(this);
        txt_cno.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                Character c = e.getKeyChar();
                if(!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE))
                {
                    e.consume();
                 }
             }
          });
    }
    
    //Sorting Classes


    public void addComponentToAdd() 
    {
        jf_AddContact = new JFrame("Add Contact");
        jf_AddContact.setLayout(null);
        jf_AddContact.setSize(300, 220);
        jf_AddContact.setVisible(true);
        jf_AddContact.setLocationRelativeTo(null);

        lbl_name.setBounds(10, 20, 100, 20);
        jf_AddContact.add(lbl_name);

        txt_name.setBounds(120, 20, 150, 20);
        jf_AddContact.add(txt_name);

        lbl_cno.setBounds(10, 70, 100, 20);
        jf_AddContact.add(lbl_cno);

        txt_cno.setBounds(120, 70, 150, 20);
        jf_AddContact.add(txt_cno);

        btn_add.setBounds(120, 140, 100, 25);
        jf_AddContact.add(btn_add);

        jf_AddContact.setResizable(false);
    }

    public void addComponentToView() 
    {
        jf_ViewContact = new JFrame("View Contact");
        jf_ViewContact.setLayout(null);
        jf_ViewContact.setSize(300, 220);
        jf_ViewContact.setVisible(true);
        jf_ViewContact.setLocationRelativeTo(null);

        jl_contact.setModel(dlm_contact);
        scroll = new JScrollPane(jl_contact);

        lbl_ct.setBounds(10, 20, 100, 20);
        jf_ViewContact.add(lbl_ct);

        scroll.setBounds(10, 50, 265, 100);
        jf_ViewContact.add(scroll);

    }

    public void actionPerformed(ActionEvent ae) 
    {
        //Action Performed Event

    }

    public void mouseClicked(MouseEvent e) 
    {
        //Mouse Clicked Event
    }
}

public class Co
{

}
