# 🚌 Bus Reservation System (Java)

A simple console-based Bus Reservation System built using **Core Java**. This project allows users to view available buses, book seats, and check seat availability.

---

## 📌 Features

* View available buses with:

  * Bus Number
  * AC / Non-AC status
  * Capacity
* Book a ticket by entering:

  * Passenger Name
  * Bus Number
  * Date of Travel
* Prevents overbooking (capacity check)
* Multiple bookings supported
* Clean object-oriented structure using:

  * `Bus`
  * `Booking`
  * `BusDemo` (Main Class)

---

## 📂 Project Structure

```
src/
 └── busReservation/
      ├── Bus.java
      ├── Booking.java
      └── BusDemo.java
```

---

## 🚀 How to Run

### **1️⃣ Clone the repository**

```bash
git clone https://github.com/Vishwahari/BusReservationSystem.git
```

### **2️⃣ Open in Eclipse**

* File → Import → Existing Projects into Workspace
* Select the cloned folder
* Finish

### **3️⃣ Run**

* Right-click `BusDemo.java`
* Run As → Java Application

---

## 📝 Sample Output

```
Bus No: 1 | AC: true | Capacity: 2
Bus No: 2 | AC: false | Capacity: 40
Bus No: 3 | AC: true | Capacity: 50

Enter 1 to Book and 2 to Exit:
1
Enter Passenger Name:
John
Enter Bus Number:
1
Enter Date (dd-MM-yyyy):
05-12-2025
Your booking is confirmed!
```

---

## 🛠 Technologies Used

* Java (Core Java)
* Eclipse IDE
* Git & GitHub

