# vending-machine
Procedure for grader:
1) An overview
    Today we are testing the following operations for the Java Coffee Company Vending Machine:
    a) Login as member
    b) Save Custom Drink
    c) Display Custom Drinks
    d) Exit Program
    The Vending machine controller will be prompting and directing you to these different sections of the code

2) Login 
    2.1) To begin log in, press 1 and hit enter
    2.2) Login and database file structure:
         You will then be asked for a username and password. We have preloaded the member database with a file already.
         The file structure is:
         Username
         Password
         Name of Saved Drink 1
         Drink type
         Drink flavor
         Add on 1, add on 2, add on 3
         
         This structure varies, as some Members have no drinks saved, and the number of add ons can vary.
        
         Here are the contents of our file "data1.txt". As a reminder, first line is the username, second line is the passowrd, and each membership is separated by a blank line.
         You can submit any of the following username password combos:
            Katy86
            Pickles123
            Monday Order
            Latte
            Hazelnut
            1 None
            Wednesday Order
            Black
            Peppermint
            2 Cream Sugar

            Coffee2go
            Gimmecoffee883
            Candy Crush
            Mocha
            Peppermint
            3 Cream Sugar Syrup

            PurpleGiraffee
            Zookeeper290
      2.3) Login successful: 
           Once you enter the username and password, you should see our UI, a box that reads "Login Successful. Welcome, username!".
           DO NOT ex out the box, or it will end the program.
           You should now see the rewards section, a numbered list of operations only avaliable to members.
           
           
 3) Save Custom Drink
        3.1) To save a custom drink, press 1 and hit enter
        3.2) Name your drink and hit enter. Drink name can have spaces and any characters
        3.3) Enter the type of drink you want. Ex: Black, Mocha, Latte. For now, there are no restrictions on the drink type. 
             This will be revised in later versions.
        3.4) Enter a drink flavor. Ex: Peppermint, Hazelnut. There are also no restrictions here.
        3.5) Enter the number of add ons you would like. Must be an integer value of 0, 1, 2, or 3. 
             If you do not submit within the restrictions, program will ask you to enter again.
        3.6) If you entered a number greater than zero, a list of add ons will appear. 
             Select the corresponding number to the add on you want and hit enter. Keep selecting your add ons until 
             you've gotten all of them.
        3.7) You should now see the details of your drink. To save your drink, enter a lowercase y. Your drink will not be 
             saved if any other value is entered.
             
 4) Display Custom Drinks
        4.1) You should now be back to the rewards section (that lists the membership operations). Enter a 2
             to show your custom drinks list.
        4.2) Your custom drinks should now be listed. If you entered into an account that already had some 
             saved custom drinks (refrence step 2.2 for the data file), they should appear along with the drink you created.
             
5) Exit program
        5.1) Enter a 3 to return to home screen
        5.2) Enter a 4 to exit
        
 This concludes the Java Coffee Company Vending Machine Procedures :)
