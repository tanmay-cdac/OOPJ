class Staff {
    String name;
    int staffId;

    void setDetails(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayDetails() {
        System.out.println(name + " Staff ID=" + staffId);
    }
}

class Doctor extends Staff {
    String specialization;

    void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

class Nurse extends Staff {
    String shift;

    void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " Staff ID=" + staffId + ", Shift=" + shift);
    }
}

public class HospitalStaff {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setDetails("Dr. Reddy", 101);
        doctor.setSpecialization("Cardiology");
        doctor.displayDetails();

        Nurse nurse = new Nurse();
        nurse.setDetails("Nisha", 102);
        nurse.setShift("Night");
        nurse.displayDetails();
    }
}
