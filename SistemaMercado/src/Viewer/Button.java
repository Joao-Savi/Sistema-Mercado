package Viewer;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    private final Component JButton;

    public Button() {
        Component jButton = null;
        JButton = jButton;
        setText("botao");
        setFont();
        setBounds();
       // COR();
    }

    public void setFont(){
        this.setFont( new Font("Arial",Font.BOLD,40));
    }

    @Override
    public Font getFont() {
        return super.getFont();
    }

    public void setBounds() {
        this.setBounds(100,200,200,60);
    }

    @Override
    public Rectangle getBounds(){
        return super.getBounds();
    }
/*
    cria uma função que define a cor do botão

    public void COR(){
        Foreground();
        Background();
    }

    private void Foreground() {
        this.setForeground(new Color(30,16,255));
    }

    private void Background(){
        this.setBackground(new Color(100,4,21));
    } */
}
