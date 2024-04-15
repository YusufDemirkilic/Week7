package view;

import business.UserManager;
import core.Helper;
import entity.User;

import javax.swing.*;
import java.awt.*;

public class LoginView extends Layout {
    private JPanel container;
    private JPanel w_bottom;
    private JLabel lbl_welcome;
    private JLabel lbl_welcome2;
    private JButton btn_login;
    private JTextField fld_pass;
    private JLabel lbl_username;
    private JLabel lbl_pass;
    private JTextField fld_username;
    private final UserManager userManager;


    public LoginView(){
        this.userManager= new UserManager();
        add(container);

        setTitle("Rent a Car ");
        setSize(400,400);
        this.setVisible(true);
        this.setLocation(Helper.getLocationPoint("x",this.getSize()),Helper.getLocationPoint("y",this.getSize()));
        btn_login.addActionListener(e -> {
            JTextField[] checkFieldList ={this.fld_username,this.fld_pass};
            if(Helper.isFieldListEmpty(checkFieldList)){
                Helper.showMsg("fill");
            }
            else {
                User loginUser=this.userManager.findByLogin(this.fld_username.getText(),this.fld_pass.getText());
                if(loginUser==null){
                    Helper.showMsg("notFounf");
                }else {
                   AdminView adminView=new AdminView(loginUser);

                }
            }
        });
    }
}
