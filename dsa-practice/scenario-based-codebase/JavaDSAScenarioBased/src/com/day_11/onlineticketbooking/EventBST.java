package com.day_11.onlineticketbooking;

public class EventBST {

    private EventNode root;


    // Insert Event

    public void addEvent(Event e) {
        root = insert(root, e);
    }

    private EventNode insert(EventNode node, Event e) {
        if (node == null)
            return new EventNode(e);

        if (e.startTime < node.event.startTime)
            node.left = insert(node.left, e);
        else
            node.right = insert(node.right, e);

        return node;
    }

    // Cancel Event

    public void cancelEvent(int startTime) {
        root = delete(root, startTime);
    }

    private EventNode delete(EventNode node, int startTime) {
        if (node == null) return null;

        if (startTime < node.event.startTime)
            node.left = delete(node.left, startTime);
        else if (startTime > node.event.startTime)
            node.right = delete(node.right, startTime);
        else {
            // Node with 0 or 1 child
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // Node with 2 children
            EventNode successor = minValueNode(node.right);
            node.event = successor.event;
            node.right = delete(node.right, successor.event.startTime);
        }
        return node;
    }

    private EventNode minValueNode(EventNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Show Events in Order
    
    public void showEvents() {
        System.out.println("📅 Upcoming Events:");
        inorder(root);
    }

    private void inorder(EventNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.event);
            inorder(node.right);
        }
    }
}
