public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge(){
        return -5;
    }

    public double collectPay(){
        return -11.1;
    }

    public void terminate(String endDate){
        System.out.println(endDate);
    }
}

class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    Employee(String name, String birthDate, String endDate, long employeeId, String hireDate){
        super(name,birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retire(){
        setRetired(true);
    }
}

class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

    public void getDoublePay(){
        setHourlyPayRate(this.hourlyPayRate * 2);
    }
}

/*
//abuse awareness for adults
unit 1
mandatory reporting is reporting all interactions suspected as cases of misconduct as a way to protect individuals
and prevent abuse from happening

    a covered individual who learns of facts that give reason to suspect that a child has suffered an incident of child abuse,
    including sexual abuse, shall as soon possible make a report of the suspected abuse to the agency designated
    by the Attorney General.”

    24 hours
    have to tell police, its all the paterno stuff

    victims dont say anything because: shame, guilt, embarrassment, confidentiality, not being believed, not wrong

    Touched inappropriately. Propositioned inappropriately. Asked to send or have received sexual photos.
    Asked to engage in inappropriate electronic communications.

    will have to give basic information when telling cops
    Remember, reporting suspicion or disclosure of abuse to authorities is absolutely mandatory within 24 hours of acknowledgement of the
    situation. No matter if you are sure whether or not the allegation is true, you must always make the report so that precautionary
    measures can be taken to protect the victim and
    keep them safe. When reporting suspicion or disclosure of abuse, be prepared to provide authorities with as much information as you can.

unit 2

    Victims of Child Abuse Act and the Protecting Young Victims from Sexual Abuse and Safe Sport Authorization Act of 2017, t

    Emotional and physical misconduct can be more prevalent in sport than anyone would like to admit. Recognizing and reporting misbehavior
    to the authorities is the most important way to stop the misconduct from continuing to happen. Examples of misconduct include:
    Bullying Cyberbullying Hazing Harassment Emotional Misconduct Physical Misconduct

    Remember, there are many negatives to these forms of emotional and physical mistreatment, including, but not limited to:
    Anxiety  Depression Lack of self esteem Withdrawal

    Every effort must be taken to prevent misconduct from occurring, but should it occur, the misconduct should be reported to authorities.


unit 3

    While no single person can prevent all sexual misconduct from occurring, understanding warning signs and knowing what action to take
     can help to ensure safety for all athletes in the sport of baseball. Remember:

     Consent is the clear knowing and voluntary agreement to engage in a sexual activity. Consent is active, not passive,
      and silence cannot be inferred as consent. An individual must be of legal age to give consent.

      Coaches and staff should institute a zero-tolerance policy for any form of sexual misconduct or child sexual abuse behavior between
       players, coaches, parents and other administrators. If an individual becomes suspicious or aware of sexual misconduct or abuse
       they must report it to authorities within a 24-hour timeframe.

       Groomers tend to give children gifts. Parents and guardians should be aware of who gave their children gifts should they receive them.

       Many victims do not disclose abuse or have difficulty doing so. If you suspect sexual misconduct, report it to authorities so that
       measures can be put in place to protect the victim.

unit 4

              In this unit, we provided information on the policies that apply to keeping athletes safe in the sport of baseball.
              When enforcing these policies within your own league or team, here are a few take-aways:

              Athletes should never meet one-on-one with a coach or an athletic trainer in a private setting.

              The athletic training must be conducted in open locations and must never be done with only a minor athlete and staff member.

              Electronic communication between staff and minor athlete must be professional in nature.

              Staff must communicate the status of a locker room or changing room to their team in advanced of practice or competitions
              and should monitor the changing area while in use.

              Staff should not drive alone with an unrelated minor athlete unless agreed by written signature of parent/legal guardian

              Staff should never share rooms with minor athletes unless parent/legal guardian or personal care assistant of minor athlete,
               and no meeting should be held in hotel rooms.


               BASE (Baseball Athlete Safety Education)

               reporting, background checks, education and trainign, minor athlete saftey policies


R28751473 control number for background check

keystone id: frankpetrillo5
keystone id questions
1) name of street gre up on
blah

2)what city was spouse born in
blah blah

3) first school attended
blah blah blah

9?6vPtgg35

Q$Q*FecK@


child abuse stuff num 000007972862

hank you for your submission. Please check your email for a confirmation notification that you may save for your own records. If you do not receive an email confirmation, contact ChildLine and Abuse Registry's Child Abuse History Clearance Unit at 1-877-371-5422.

You may view or check the status of your application from your PA Child Abuse History Clearance Account at any time. Once your application has been processed, you will receive a notification via email to log in to your account and view the outcome/result of the application.

You can also log into your account at any time from the Child Welfare Portal homepage.




 */
