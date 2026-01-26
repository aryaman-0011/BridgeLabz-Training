package com.day_11.hospitalqueue;

public class HospitalAVL {

    private PatientNode root;

    private int height(PatientNode n) {
        return n == null ? 0 : n.height;
    }

    private int balance(PatientNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    private PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    //  Patient Registration
    
    public void register(Patient p) {
        root = insert(root, p);
    }

    private PatientNode insert(PatientNode node, Patient p) {
        if (node == null) return new PatientNode(p);

        if (p.checkInTime < node.patient.checkInTime)
            node.left = insert(node.left, p);
        else
            node.right = insert(node.right, p);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int bal = balance(node);

        if (bal > 1 && p.checkInTime < node.left.patient.checkInTime)
            return rightRotate(node);
        if (bal < -1 && p.checkInTime > node.right.patient.checkInTime)
            return leftRotate(node);
        if (bal > 1 && p.checkInTime > node.left.patient.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && p.checkInTime < node.right.patient.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    
    // Discharge Patient
    
    public void discharge(int checkInTime) {
        root = delete(root, checkInTime);
    }

    private PatientNode delete(PatientNode node, int time) {
        if (node == null) return null;

        if (time < node.patient.checkInTime)
            node.left = delete(node.left, time);
        else if (time > node.patient.checkInTime)
            node.right = delete(node.right, time);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            PatientNode temp = minNode(node.right);
            node.patient = temp.patient;
            node.right = delete(node.right, temp.patient.checkInTime);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = balance(node);

        if (bal > 1 && balance(node.left) >= 0)
            return rightRotate(node);
        if (bal > 1 && balance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && balance(node.right) <= 0)
            return leftRotate(node);
        if (bal < -1 && balance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private PatientNode minNode(PatientNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    
    // Display by Arrival Time
    
    public void displayPatients() {
        System.out.println("🏥 Patients by Arrival Time:");
        inorder(root);
    }

    private void inorder(PatientNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.patient);
            inorder(node.right);
        }
    }
}
