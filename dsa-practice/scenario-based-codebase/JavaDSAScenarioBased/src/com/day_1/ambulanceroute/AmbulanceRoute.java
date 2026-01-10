package com.day_1.ambulanceroute;


public class AmbulanceRoute {

    private HospitalUnit head;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Find nearest available unit
    public void routePatient() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnit temp = head;

        do {
            if (temp.available) {
                System.out.println("Patient routed to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No available units right now");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(unitName)) {

                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed (Maintenance)");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Display route
    public void displayUnits() {
        if (head == null) return;

        HospitalUnit temp = head;
        System.out.print("Hospital Route: ");

        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to " + head.name + ")");
    }
}
