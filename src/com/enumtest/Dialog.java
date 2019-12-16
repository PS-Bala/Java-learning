package com.enumtest;

enum Position {
    LEFT, RIGHT, TOP, BOTTOM;
}
public class Dialog {
    public Position dialogPosition;

    public Dialog(Position dialogPosition) {
        this.dialogPosition = dialogPosition;
    }

    public void setDialogPosition() {
        switch (dialogPosition) {
            case LEFT:
                System.out.println("Dialog in left position");
                break;
            case RIGHT:
                System.out.println("Dialog in right position");
                break;
            case TOP:
                System.out.println("Dialog in top position");
                break;
            case BOTTOM:
                System.out.println("Dialog in bottom position");
                break;
        }
    }
    public static void main(String[] args) {
        String pos = "RIGHT";
        Dialog dialog = new Dialog(Position.valueOf(pos));
        dialog.setDialogPosition();
    }
}
