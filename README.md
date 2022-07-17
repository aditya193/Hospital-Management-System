# Hospital-Management-System

---------------------------------------------
|Name|
|----|
|Allen Namdeo|
|Aditya Jain|
---------------------------------------------

<h3>About Project: </h3>
<ul>
  <li>The system has 3 actors, namely Admin, Doctor & Receptionist</li>
  <li>The actions performed by the actors are described below: </li>
    <ul>
      <li><b>Admin actions:</b>
        <ol>
          <li>It can fetch details of Doctors, Patients & Receptionist</li>
          <li>It can add/update/delete any of the actors except admin</li>
        </ol>
      </li>
      <li><b>Doctor actions: </b>
        <ol>
           <li>Doctors can fetch the details of the appointments, which they need to attend.</li>
        </ol>
      </li>
      <li><b>Receptionist action:</b>
        <ol>
          <li>It can book an appointment by selecting a patient and appropriate doctor.</li>
          <li>it also can insert/update patient and patient information.</li>
        </ol>
      </li>
    </ul>

  <li>The Doctors, Receptionist and Patients can be registered in the system during the runtime using the user interface. </li>
  <li>Registration of admins are to be done explicitly by inserting registration details in the database. </li>
  <li>Email-id validation check is applied on the email field. </li>
  <li><b>An Email notification system is applied in the project</b></li>
    <ul>
      <li>Whenever a new Doctor or a new Patient is registered in the system, a notification email of successful registration is also sent to that actor. </li>
      <li>An email is sent to the registered email-id of the patient containing appointment details as soon as the receptionist books an appointment for that patient. </li>
      <li>Other than the patient, the doctor receives an email containing details of appointments which they need to attend. </li>
    </ul>
  
  <h3>Technologies used: </h3>
  <ul>
  <li><b>Frontend: </b>Java Swing</li>
  <li><b>Backend: </b>Java</li>
  <li><b>Database: </b>MySQL</li>
  </ul>
  
  <h3>Database Structure:</h3>
  <ul>
  <li>The Database Contains five Tables
    <ol>
      <li><b>Admin:</b>contains only username and password field.</li>
      <li><b>Appointment:</b>contains details of appointment which includes doctors and patient information. </li>
      <li><b>Doctor: </b>stores details about the doctors including their login details. </li>
      <li><b>Patient: </b>stores patient details </li>
      <li><b>Receptionist: </b>stores details about the receptionists including their login details. </li>
    </ol>
  </li>
  </ul>
  
  <h3>Installation Steps: </h3>
  <ul>
    <li>Clone or download the project in zip format.</li>
    <li>Create the database and the required tables, by using the hospital.sql file provided in the repository. </li>
    <li>Open the project using any Java development environment. </li>
    <li>In the main package Connector class, it will be required to change mysql username and password as per your machine which are given as parameters in getConnection method. </li>
    <li>Update the sender’s email address in the EmailSystem class in the main package. </li>
    <li>Now, the project is ready to start.</li>
  </ul>
  
   <h3>ER Diagram: </h3>
   
   ![hospital_management_system_ER_diagram](https://user-images.githubusercontent.com/62331631/179419445-ddaf2a9a-d57a-4591-a116-2eb8e6a661b9.png)
