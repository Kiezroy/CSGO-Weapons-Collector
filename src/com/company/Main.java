package com.company;
import java.util.*;

public class Main {

    private static double balance = 10.0;
    private static int GlockAMT, P2000AMT, R8RevolverAMT, M4A1AMT, AK47AMT, AWPAMT, MP5AMT, NegevAMT, CTAMT, TAMT = 0;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n===========Welcome to CSGO Weapons Collector!===========\n");
        System.out.println("Balance: $" + Math.round(balance * 100.0) / 100.0);

        System.out.println("\t1 ◦Open Case($2.47)\n\t2 ◦Market\n\t3 ◦Quit");
        System.out.println("\n========================================================");

        boolean running = true;

        while(running) {
            switch (input.nextInt()) {
                case 1:
                    openCase();
                    break;
                case 2:
                    goMarket();
                    break;
                case 3:
                    running = false;
                    System.exit(0);
                default:
                    System.out.println("Invalid Command!");
            }
        }
    }

    public static void openCase(){

       if(balance >= 2.47) {
           balance -= 2.47;

           Scanner input = new Scanner(System.in);
           String str = randomGun();
           System.out.println("Opening...You received a " + str);
           ascii(str);
           System.out.println("Balance: $" + Math.round(balance * 100.0) / 100.0);

           System.out.println("\t1 ◦Open another($2.47)\n\t2 ◦Back");

           switch (input.nextInt()) {
               case 1:
                   openCase();
                   break;
               case 2:
                   mainMenu();
                   break;
               default:
                   System.out.println("Invalid Command!");
           }

       }
       else{
           System.out.println("You lost all your money loser! Gaben is very happy now idiot!");
           gaben();
           System.exit(0);
       }
    }

    public static String randomGun(){
        int num = (int)(Math.random() * 101) + 0;

        if(num <= 25){
            balance += 1;
            GlockAMT++;
            return "Glock!";
        }
        else if(num > 25 && num <= 48){
            balance += 2;
            P2000AMT++;
            return "P2000!";
        }
        else if(num > 48 && num <= 58){
            balance += 2.5;
            R8RevolverAMT++;
            return "R8 Revolver!";
        }
        else if(num > 58 && num <= 68){
            balance += 4.5;
            M4A1AMT++;
            return "M4A1-S!";
        }
        else if(num > 68 && num <= 73){
            balance += 5;
            AK47AMT++;
            return "AK-47!";
        }
        else if(num > 73 && num <= 78){
            balance += 8.5;
            AWPAMT++;
            return "AWP!";
        }
        else if(num > 78 && num <= 88){
            balance += 3;
            MP5AMT++;
            return "MP5!";
        }
        else if(num > 88 && num <= 98){
            balance += 3.5;
            NegevAMT++;
            return "Negev!";
        }
        else if(num > 98 && num <= 99){
            balance += 50;
            CTAMT++;
            return "CT Knife!";
        }
        else{
            balance += 50;
            TAMT++;
            return "T Knife!";
        }
    }

    public static void goMarket(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n=================Welcome to the Market!=================");
        System.out.println("\n\t1 ◦Buy\n\t2 ◦Sell\n\t3 ◦Back");
        System.out.println("\n========================================================");
        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("|.'',        Gaben's Firearms Store         ,''.|\n" +
                        "|.'.'',                                 ,''.'.|\n" +
                        "|.'.'.'',                             ,''.'.'.|\n" +
                        "|.'.'.'.'',                         ,''.'.'.'.|\n" +
                        "|.'.'.'.'.|                         |.'.'.'.'.|\n" +
                        "|.'.'.'.'.|===;                 ;===|.'.'.'.'.|\n" +
                        "|.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|\n" +
                        "|.'.'.'.'.|---|'.|, _______ ,|.'|---|.'.'.'.'.|\n" +
                        "|.'.'.'.'.|:::|'.|'|PewPew.|'|.'|:::|.'.'.'.'.|\n" +
                        "|,',',',',|---|',|'|PewPew.|'|,'|---|,',',',',|\n" +
                        "|.'.'.'.'.|:::|'.|'|PewPew.|'|.'|:::|.'.'.'.'.|\n" +
                        "|.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|\n" +
                        "|.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|\n" +
                        "|.'.'.'.'.|%%%%%%%%%%%%%%%%%%%%%%%%%|.'.'.'.'.|\n" +
                        "|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n" +
                        "|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n" +
                        "|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n" +
                        "|.','          /%%%%%%%%%%%%%%%\\          ','.|\n" +
                        "|;____________/%%%%%%%%%%%%%%%%%\\____________;|");
                buy();
                break;
            case 2:
                sell();
                break;
            case 3:
                mainMenu();
                break;
        }
    }

    public static void buy(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat would you like to purchase?\nBalance: $" + Math.round(balance * 100.0) / 100.0);

        System.out.println("\n\t1 ◦Glock $1\n\t2 ◦P2000 $2\n\t3 ◦R8 Revolver $2.50\n\t4 ◦M4A1-S $4.50\n\t5 " +
                "◦AK-47 $5.00\n\t6 ◦AWP $8.50\n\t7 ◦MP5 $3.00\n\t8 ◦Negev $3.50\n\t9 ◦CT Knife $50\n\t10 ◦T Knife $50\n\t11 ◦Back");


        int num = input.nextInt();

        if(balance >= 1) {
            switch (num) {
                case 1:
                    balance--;
                    GlockAMT++;
                    ascii("Glock!");
                    buy();
                    break;
                case 2:
                    balance -= 2;
                    P2000AMT++;
                    ascii("P2000!");
                    buy();
                    break;
                case 3:
                    balance -= 2.5;
                    R8RevolverAMT++;
                    ascii("R8 Revolver!");
                    buy();
                    break;
                case 4:
                    balance -= 4.5;
                    M4A1AMT++;
                    ascii("M4A1-S!");
                    buy();
                    break;
                case 5:
                    balance -= 5;
                    AK47AMT++;
                    ascii("AK-47!");
                    buy();
                    break;
                case 6:
                    balance -= 8.5;
                    AWPAMT++;
                    ascii("AWP!");
                    buy();
                    break;
                case 7:
                    balance -= 3;
                    MP5AMT++;
                    ascii("MP5!");
                    buy();
                    break;
                case 8:
                    balance -= 3.5;
                    NegevAMT++;
                    ascii("Negev!");
                    buy();
                    break;
                case 9:
                    balance -= 50;
                    CTAMT++;
                    ascii("CT Knife!");
                    buy();
                    break;
                case 10:
                    balance -= 50;
                    TAMT++;
                    ascii("T Knife!");
                    buy();
                    break;
                case 11:
                    goMarket();
                    break;
            }
        }
        else{
            System.out.println("Out of funds loser! You're in debt, sell your soul to our lord Gaben!");
            gaben();
        }
    }

    public static void sell() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat would you like to sell?\nBalance: $" + Math.round(balance * 100.0) / 100.0);

        //System.out.println("\n\t1 ◦Glock $1 Qty: " + GlockAMT + "\n\t2 ◦P2000 $2 Qty: " + P2000AMT "\n\t3 ◦R8 Revolver $2.50\n\t4 ◦M4A1-S $4.50\n\t5 " +
        //"◦AK-47 $5.00\n\t6 ◦AWP $8.50\n\t7 ◦MP5 $3.00\n\t8 ◦Negev $3.50\n\t9 ◦CT Knife $50\n\t10 ◦T Knife $50\n\t11 ◦Back");

        System.out.printf("\n\t1 ◦Glock $1 Qty: %d\n\t2 ◦P2000 $2 Qty: %d\n\t3 ◦R8 Revolver $2.50 Qty: %d\n\t4 ◦M4A1-S $4.50 Qty: %d\n\t5 " +
                        "◦AK-47 $5.00 Qty: %d\n\t6 ◦AWP $8.50 Qty: %d\n\t7 ◦MP5 $3.00 Qty: %d\n\t8 ◦Negev $3.50 Qty: %d\n\t9 ◦CT Knife $50 Qty: %d\n\t10 ◦T Knife $50 Qty: %d\n\t11 ◦Back\n",
                GlockAMT, P2000AMT, R8RevolverAMT, M4A1AMT, AK47AMT, AWPAMT, MP5AMT, NegevAMT, CTAMT, TAMT);

        int num = input.nextInt();


        //Change this to if and if else statement checking with the case and the amount
        //The problem: else statement messes it up because condition is always false

        if(num == 1 && GlockAMT > 0){
            balance++;
            GlockAMT--;
            System.out.println("\nSold THAT piece of shit!");
            sell();
        }
        else if(num == 1 && GlockAMT <= 0){
            System.out.println("\nNo more Glocks! Returning to menu!");
            mainMenu();
        }
        if(num == 2 && P2000AMT > 0){
            balance += 2;
            P2000AMT--;
            System.out.println("\nGoodbye worthless CT Pistol!");
            sell();
        }
        else if(num == 2 && P2000AMT <= 0){
            System.out.println("\nNo more P2000s! Returning to menu!");
            mainMenu();
        }
        if(num == 3 && R8RevolverAMT > 0){
            balance += 2.5;
            R8RevolverAMT--;
            System.out.println("\nPeace out bitch, deagle is better!");
            sell();
        }
        else if(num == 3 && R8RevolverAMT <= 0){
            System.out.println("\nNo more Revolvers! Returning to menu!");
            mainMenu();
        }
        if(num == 4 && M4A1AMT > 0){
            balance += 4.5;
            M4A1AMT--;
            System.out.println("\nI'm sorry to see you go good friend...");
            sell();
        }
        else if(num == 4 && M4A1AMT <= 0){
            System.out.println("\nNo more M4A1's! Returning to menu!");
            mainMenu();
        }
        if(num == 5 && AK47AMT > 0){
            balance += 5;
            AK47AMT--;
            System.out.println("\nNo more one taps for me :(");
            sell();
        }
        else if(num == 5 && AK47AMT <= 0){
            System.out.println("\nNo more AK-47's! Returning to menu!");
            mainMenu();
        }
        if(num == 6 && AWPAMT > 0){
            balance += 8.5;
            AWPAMT--;
            System.out.println("\nRIP Can't quickscope with this AWP!");
            sell();
        }
        else if(num == 6 && AWPAMT <= 0){
            System.out.println("\nNo more AWP's! Returning to menu!");
            mainMenu();
        }
        if(num == 7 && MP5AMT > 0){
            balance += 3;
            MP5AMT--;
            System.out.println("\nGarbage SMG");
            sell();
        }
        else if(num == 7 && MP5AMT <= 0){
            System.out.println("\nNo more MP5's! Returning to menu!");
            mainMenu();
        }
        if(num == 8 && NegevAMT > 0){
            balance += 3.5;
            NegevAMT--;
            System.out.println("\nGood memories with this laserbeam...");
            sell();
        }
        else if(num == 8 && NegevAMT <= 0){
            System.out.println("\nNo more Negev's! Returning to menu!");
            mainMenu();
        }
        if(num == 9 && CTAMT > 0){
            balance += 50;
            CTAMT--;
            System.out.println("\nKill myself");
            sell();
        }
        else if(num == 9 && CTAMT <= 0){
            System.out.println("\nNo more Knives! Returning to menu!");
            mainMenu();
        }
        if(num == 10 && TAMT > 0){
            balance += 50;
            TAMT--;
            System.out.println("\nKill myself");
            sell();
        }
        else if(num == 10 && TAMT <= 0){
            System.out.println("\nNo more Knives! Returning to menu!");
            mainMenu();
        }
        else
            //(num == 11)
            {
            goMarket();
        }
    }


    public static void ascii(String str){
        switch (str){
            case "Glock!":
                System.out.println(" _  __)\\____________________________________/7_\n" +
                        "    (//   )))))                                   `\\||\n" +
                        "     /   (((((                                      )`\n" +
                        "    (______________________________________________/\n" +
                        "     \\   ________ ______________________________/\n" +
                        "      ) /#######/ )\\  /     )/\n" +
                        "     / /##(\\)##/ /  \\(     //\n" +
                        "    / /#######( (\\______.ad`\n" +
                        "   / /#########) )------``\n" +
                        "  / /#########/ /\n" +
                        " / /###(/)###/ /\n" +
                        "( (#########/ (\n" +
                        " \\____/_______\\)");
                break;
            case "P2000!":
                System.out.println("+-'~`---------------------------------/\\--\n" +
                        "||\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" \\\\\\\\\\\\  \\/~)\n" +
                        "||                                  \\\\\\\\\\\\  \\/_\n" +
                        " |~~~~~~~~-________________-_________________\\ ~--_\n" +
                        " !---------|_________       ------~~~~~(--   )--~~\n" +
                        "                     \\ /~~~~\\~~\\   )--- \\_ /(\n" +
                        "                      ||     |  | \\   ()   \\\\\n" +
                        "                      \\\\____/_ / ()\\        \\\\\n" +
                        "                       `~~~~~~~~~-. \\        \\\\\n" +
                        "                                   \\ \\  <($)> \\\\\n" +
                        "                                    \\ \\        \\\\\n" +
                        "                                     \\ \\        \\\\\n" +
                        "                                      \\ \\        \\\\\n" +
                        "                                       \\ \\  ()    \\|\n" +
                        "                                       _\\_\\__====~~~");
                break;
            case "R8 Revolver!":
                System.out.println("   .-.____________________.-.\n" +
                        "     ___ _.' .-----.    _____________|\n" +
                        "    /_._/   (      |   /_____________|      \n" +
                        "      /      `  _ ____/                     \n" +
                        "     |_      .\\( \\\\                         \n" +
                        "    .'  `-._/__`_//\n" +
                        "  .'       |\"\"\"\"'\n" +
                        " /        /\n" +
                        "/        |\n" +
                        "|        '\n" +
                        "|         \\\n" +
                        "`-._____.-'");
                break;
            case "M4A1-S!":
                System.out.println("                   ,1             ,-===========.\n" +
                        "                    /,| ___________((____________\\\\_                _\n" +
                        " ,========.________//_|/===========._#############L_Y_....-----====//\n" +
                        "(#######(==========\\################\\=======.______ --############((\n" +
                        " `=======`\"        ` ===============|::::.___|[ ))[JW]#############\\\\\n" +
                        "                                    |####|     \"\"\\###|   :##########\\\\\n" +
                        "                                   /####/         \\##\\     ```\"\"\"=,,,))\n" +
                        "                                  /####/           \\##\\\n" +
                        "                                 '===='             `=`");
                break;
            case "AK-47!":
                System.out.println("                   .-----------------TTTT_-----_______\n" +
                        "                       /''''''''''(______O] ----------____  \\______/]_\n" +
                        "    __...---'\"\"\"\\_ --''   Q                               ___________@\n" +
                        "|'''                   ._   _______________=---------\"\"\"\"\"\"\"\n" +
                        "|                ..--''|   l L |_l   |\n" +
                        "|          ..--''      .  /-___j '   '\n" +
                        "|    ..--''           /  ,       '   '\n" +
                        "|--''                /           `    \\\n" +
                        "                     L__'         \\    -\n" +
                        "                                   -    '-.\n" +
                        "                                    '.    /\n" +
                        "                                      '-./");
                break;
            case "AWP!":
                System.out.println("                                 ____    _     __     _    ____\n" +
                        "                                     |####`--|#|---|##|---|#|--'##|#|\n" +
                        "   _                                 |____,--|#|---|##|---|#|--.__|_|\n" +
                        " _|#)_____________________________________,--'EEEEEEEEEEEEEE'_=-.\n" +
                        "((_____((_________________________,--------[JW](___(____(____(_==)        _________\n" +
                        "                               .--|##,----o  o  o  o  o  o  o__|/`---,-,-'=========`=+==.\n" +
                        "                               |##|_Y__,__.-._,__,  __,-.___/ J \\ .----.#############|##|\n" +
                        "                               |##|              `-.|#|##|#|`===l##\\   _\\############|##|\n" +
                        "                              =======-===l          |_|__|_|     \\##`-\"__,=======.###|##|\n" +
                        "                                                                  \\__,\"          '======'");
                break;
            case "MP5!":
                System.out.println(" ||\n" +
                        "  ||_________________________/'|\n" +
                        " _| O======/                   |\n" +
                        "|_|              ============  |\n" +
                        "  |  __  ______________________|\n" +
                        "  |_/  )(     |___||     O-   /\n" +
                        "      (  )    /  / |_________/\n" +
                        "      (  )   /  /    | ) |   |\n" +
                        "      (__)  /  /     \\___|__(\n" +
                        "           /  /          )   \\\n" +
                        "          /  /            )   \\\n" +
                        "         /  /              )___\\\n" +
                        "        /  /\n" +
                        "       /__/");
                break;
            case "Negev!":
                System.out.println("                          __,--.\n" +
                        "       ,                 /_,__,_)        ,----.\n" +
                        "      /|________________//__   __________|'##'|_____\n" +
                        "=====(  )_##################)==`)###################|\n" +
                        "     ,' |_)#################)===)#######__`__`__`___|____\n" +
                        "    =`--\"._,_,_#############)===)######(_,_,_,_,_,_,_,_,_)\n" +
                        "               '--,_,__,__|.------.,--.,-.[JW],-----'\n" +
                        "                           |-##-| ||  )) |###(\n" +
                        "                           |-##-| '======|,###\\\n" +
                        "                           '----'        \\,####\\\n" +
                        "                                          \\,####)\n" +
                        "                                           \\_,-\"");
                break;
            case "CT Knife!":
                System.out.println("                                   _----..................___\n" +
                        " __,,..,-====>       _,.--''------'' |   _____  ______________`''--._\n" +
                        " \\      `\\   __..--''                |  /::: / /::::::::::::::\\      `\\\n" +
                        "  \\       `''                        | /____/ /___ ____ _____::|    .  \\\n" +
                        "   \\                          ,.... |            `    `     \\_|   ( )  |\n" +
                        "    `.                       /`     `.\\ ,,''`'- ,.----------.._     `   |\n" +
                        "      `.                     |        ,'       `               `-.      |\n" +
                        "        `-._                 \\                                    ``.. /\n" +
                        "            `---..............>");
                break;
            case "T Knife!":
                System.out.println("                                                       ___\n" +
                        "                                                      |_  |\n" +
                        "                                                        | |\n" +
                        "__                      ____                            | |\n" +
                        "\\ ````''''----....____.'\\   ````''''--------------------| |--.               _____      .-.\n" +
                        " :.                      `-._                           | |   `''-----''''```     ``''|`: :|\n" +
                        "  '::.                       `'--.._____________________| |                           | : :|\n" +
                        "    '::..       ----....._______________________________| |                           | : :|\n" +
                        "      `'-::...__________________________________________| |   .-''-..-'`-..-'`-..-''-.cjr :|\n" +
                        "           ```'''---------------------------------------| |--'                         `'-'\n" +
                        "                                                        | |\n" +
                        "                                                       _| |\n" +
                        "                                                      |___| ");
                break;
        }
    }

    public static void gaben(){
        System.out.println("echo \",;,,,;,;,;,;,;,;,;;;;L                ...:,;;L;L;FyjjEhK5hKOO8S8SESpObb8OBOpb88bbpO8bb8BbQBQBQQgQQBQBQBQBQbbGpOGnzLrL;,  ,,:.... ..:L;;,;;;;,;;;;;,;;;,;,;,;,;,;\"\n" +
                "echo \";;;;;;;;;;;;;;;;;;;;L;      .         :;;;rzyyZFFZGOpG8OQ8Bbb8QBB8bBQBgg8OBbBOBBQBQQgggggg@g@g@g@@@@@@@@@@@g@ggQb5yL;;;:. .         ,zc;;;L;;;;;;;;;;;;;;;;;;;;;\"\n" +
                "echo \",;,;,;,;,;,;,;;;,;,;;,     .   . .   ,;;;cLFzjFzyh3hKShS5OGES88bpGEOhGGGnGhEEOE8bQQQBQBQQgQgQgQQQgQQBQQgQgQQQQBQbOyL:: .,:.  ,;;;;   ;:;;;;;;;,;,;;;;;;;,;,;,;,;\"\n" +
                "echo \";;;,;,;,;,;,;,;,;,;;L,      . ..,:::,,;;L;rLLF7cyZE5SSGoE5GE8pbbBSGEOpGhOp85O8BBgQgQgggQgQgggQgQgQQQgQQQgQQQQQQQQQBKr;:   .;cz5ShSL ...;L,;;;;;;;,;;;;;;;,;,;,;;\"\n" +
                "echo \":;,;,;,;,;;;,;,;,;,;;;       ....,;;,;;;;LLrrzrzLyyZK55OE5hp8bBQpG5hOOhGE8bBbQQQBQQgQgQgggggggQgQgQQQgQgQQQgQQQQBgQQpn;;.  .,.:rF7y,   .;;;;;;;;;;;;;;;;;;,;,;,;\"\n" +
                "echo \";;;,;,;,;,;,;,;;;;;;;;.   . .   ..,;;,;,;;LLz;7zcznZhoOGOE8bBbQQBEEKOGOE88QQBBBbQBgQgggQgggQgQgQgQgQgQgggBQQQBQBQBQQgB5LL;;.. . :;;;c;L;;:;;;;;,;;;;;;;;;,;,;,;;\"\n" +
                "echo \",;,;,;,;,;,;,;;;;;,;;L.    .   ..,,;,;,;;;;;;L;cLjnhK558OGEBbBQQQbGpEOO8pbQQOBbQQgggggg@ggQgQgBQQggggQQgQQBQQQQQBQBQQgQby,,7  .   ;z8@g@h.:;;;;;,;;;;;,;,;;;,;,;\"\n" +
                "echo \",;;,;,;,;,;,;,;,;;;;;;;   .   ..::;;;,;,;;;;;,;;rzZKEhEObG8pbbQQgb8ObOGpBbQb8pbpQQgg@ggggQQ8BBB8QQQQQBQQgQQQQBQQQQQQg@@gO  :      3j;;LE@7.,;;;;;;;;;,;;;;;,;;;;\"\n" +
                "echo \",;,;,;,;,;,;;;;;;;;;;;L,   .   ..,,;;;;;;;;L;;;;;zzZoS5O8b8bEbbQgQGpOB8SOOS5j5nh5ych53SpGOGESOSEoOOO5O8BbQBQQgQgg@@@gS::;K8G,,;L,nQQoy. Sg:,,;;;,;;;;;;;,;,;,;,;\"\n" +
                "echo \";;;,;,;,;,;,;;;,;,;;;;;;       .,:,,;,;;;;;;L;LLLLyoESOOp8bO8bbBg83SpGB5ncr;;;;;L:,;,,;,,,;rnnpphnKKS5OOpQgQgg@@@b7   ;p@BQbKLjQbQgQb8Z.c@L:;;;;;;;;;,;,;,;,;;;;\"\n" +
                "echo \",;,;,;,;,;;;,;,;;;;;;;;L,      ..,:,,;,;;;;;;LLrLzcyZhGOEp5hpb8QBOcKEOE5;LLL;L,,;;,:.,:,:;,;;;ro8gQgBQQQQgg@gQZ.   rb@ggQBOQbObQggQgBBO;,@F:;;;;;;,;;;;;;;;;,;,;\"\n" +
                "echo \",;;,;,;,;,;;;,;,;;;,;;;;r:      ::,.,:,,L;L;L;;;;,;;;;;;j3oy3KOGBn;yOO8pSz7LFryjL;zKGE88BBgg@@@B8EB@@BQg@QG;   .ng@@@QQBB8pBQBg@@ggggB8;L@c.;;;;;,;;;;;,;,;;;,;;\"\n" +
                "echo \":;,;,;,;,;,;,;;;;;;;;;;;;L.    ..:::.::,;;,;;;,:....   .:,;;;Ljhn;,yhBQ@ggbGzZ3Lnb88OpG88BBQggg@gg3yKppF.   ,8@@g@gQBQbB88ObQgoy8BBQBQBzOb.,,;,;;;;;;;,;,;;;;;,;\"\n" +
                "echo \";;;,;,;,;,;;;,;,;;;;;;;;;;L     .:::,:. ....,.. ..,:,,;,:...;;c;:,LzSb@@@g@bp7.jSKSKF;. .  ;. ,,;;yc;oE.:Lb@@@@QQBQBQbBbb888QE .zSb8BQgGgL.,;;;;;;;,;;;;;;;,;,;;\"\n" +
                "echo \",;,;,;,;,;,;;;;;;;;;;;;;;LL.     :,,,,.      .,LFhOb8BQQO8h3z7;;..,L,;;;FOphByhy,;:. .;;.  ;:;FZEbBQ8QBQQ@ggQQQgBBbQBQBb8B88bbz:;noOOBgQQ,.;,;;;;;,;;;;;;;,;;;,;\"\n" +
                "echo \",;;,;,;,;,;,;,;;;;;;;;;;;,,:.     .:,;,.....;LFjKZ5SShjLF7zrL;. c.  ,r7KBB8LLr8S7;;;;LcLcrjSQg@@@gQ8bpbbbQgQgQQQQBbbBBBbBbB88Q@bz;LyohQQQ::,;;;;;;;,;;;;;;;,;;;;\"\n" +
                "echo \":;,;,;,;,;,;,;,;,;;;;;;;;: ......    :::.. ;,;;;::..   y.:       . .ZbE8Q@@g.,y38BhjyyFZZES8p8pB8bbQbbQQQQQQQQQQBQbbbQBQbBbbO8g@g5L7ZOQgQ;.;,;;;;;;;;;,;;;,;,;,;\"\n" +
                "echo \",;;,;,;,;,;,;,;,;,;,;;;;L.    . . :.      :,          .zLcr;;;:... :yKEbQQ@@B.p5,3bOOSGhOOOSOGppbQgBBQgQQQQBQQQQQbb8BQQBBbBbbhBg8c;zObgBg,,,;,;,;,;,;;;;;;;;;,;;\"\n" +
                "echo \",;,;,;,;,;,;;;,;;;;;;;;;;;      ...,::..  ,c   ..,,;;zyn3oZnc;.... ,;ypbQQg@gg;Go3ZohOEO5OOO8b8ObQBBQQBQQQQQQQBQBB8bpQBQQQBBb8SShppQQQpgS.:;;;;;;;;;,;;;,;,;,;,;\"\n" +
                "echo \",;,,;,;,;,;,;;;,;;;;;;;;;;;.    ...:::,,;:.K;.,,;Lz7yyyzyrrLL;;....;;jbBgggg@@@8ggbhEhhK5ZEGOSKySGb8bbBbQQgQgQQQQbQBBpQQQQQBB8phbQgQQpB@z.,;;,;;;;;,;,;,;;;,;,;;\"\n" +
                "echo \",;,;,;,;,;,;,;,;,;;;;;;;;;;r;.   ....:,;;;:;OF.:,;;LrrLr;L;L;;::::;;;GBgggggggg@@@ggbbOOEEhhoh5OObbBBQQQQQQgQQQQQQQQBBBQQQBB8BpOQgBQbQg8c;,;;;;;;;;;;;,;,;;;,;,;\"\n" +
                "echo \",;,,;,;,;,;,;;;;;;;;;;;;;;;;LL;.......:,;;r;;hG7L;L;rLLLc;r;;,,,;;;,;nbQgggQgggg@g@QQ8B88p8O8OBbbbBBQQgggQgQQQQQQBQQQbQbQQQbQbBEbQQQQQ8;,;;;;;;;;;;;;,;;;,;;;,;;\"\n" +
                "echo \",;,,,;,;,;,;,;,;;;,;;;;;;;;;;;;r:  ...:;,;;;;;75hKFyzyFzLc;;;L;L;;;;;yGbQgQgQgQgggQQOo3ESSG8O8pb8QBQBgQgQgQgBQBQBQBQBbBQBQQQbBBbOQbbbgn .;;;;;;;;;;;;;;;,;;;,;,;\"\n" +
                "echo \",;;,;,;,;,;,;,;,;,;;;;;;;;;;;;;;L.. ..::;:;;L;L;LcjyZyZFyzFzzL;,,;;,rjEpQQgQQBgQQBBBQ5r;;LFnK5OOb8bbQBQQgggQQBQBQQQQQbBBQbQQQBB8p8BbQ@O .;;;;;;;;;;;;;;,;;;,;,;;\"\n" +
                "echo \",;,;,;,;,;,;,;,;,;,;;;;;;;;;;;;;;;...:.::;,;;LLyZShGGESEKKjz;,..:;;;;ZSbQgQQQQQQ8bbQQQn;,::;;7ySEppbbBQgQQBQQQbQQQQQQQbBQQBQBQbBObg@@@.::;;;;;;;;;;;;;,;;;;;,;,;\"\n" +
                "echo \";;,,;,;,;,;,;,;,;,;,;,;;;;;;;;;;;;,...:.::;,;;zF535oEo5jycL,.  :;,;,;yppQQgQgQQQQQgggQ8GGy;::,;roS8p88QQQQQBBBQ8QQQBQQQ8QQQBQBB8bObEc  ;;;;;;;;;;,;;;,;,;,;,;,;;\"\n" +
                "echo \",;,;,;,;,;,;,;,;,;,;,;;;;;;;;;;;;;;,.:...::;;L7zj5K5K5ZyrL,.   L;;;;;ch8bQggQgQgggQbObBQBbEj;;:;;ynEE88BBQBQBQQBBQQQBQbQBQBQBBbB8B;    :,LLL;;;;;;,;;;;;,;,;,;,;\"\n" +
                "echo \",,;,,,;,;,;,;,;,;,;,;;;;;;;;;;;;;;L;..:...::;;z7jZ5noK5Zz;;.  :;;;;;zFS8BQgg@QgBbOEnOQgQgBBpOycLL;c7yKGO88BbQBQBQBQQQQQBQBQbQBQbbbO,    ..::,;L;L;;;;;;,;,;,;,;,\"\n" +
                "echo \",;,;,,,;,;,;,;,;,;;;,;,;,;;;;;;;;;;;.......,,LLz7Z333oKEnz;;:;,,:::;LKSp8QggggBbQQQQbQQgQQ8b8b53nc7KK3opOBBQBQBQbBBQBQBQQQBQbQbB8bpby          ..;;;;;;;,;,;,;,;\"\n" +
                "echo \";,,,;,;,;,;,;,;,;,;,;,;,;;;;;;;;;;;;: :.,.::;;LLyy5ZKKh5oFF;;;;;;.. .;ynhObBBZ3SOpBbQQQQQbB8bBQ8QE3KO88ObBQQQBQB8BQQgBQQQbBbBBB8b8pOQO.           .,L;;;;,;,;,,;\"\n" +
                "echo \",;,,,,,;,;,;,;,;,;,;,;;;,;,;;;,;;;;L, ..::..:;;rFZZo3ESh3ncrLL;;;;.....,;znhz;zny5O8bQQQBQQQBQQgB8ozy55nhQBQBQBQbBBQQQBQBBb88b8b8bpEOB8.            .;;;,;,;,;,;\"\n" +
                "echo \";,,:,,,,;,;,;,;,;,;,;,;,;;;,;;;;;;;;L...::...:;;cLjZ5oSo53F;;;;,;,;;;;LLyyh5SS5nEOBbgg@@@@@@@Q8Sy7y7y;;LSBQbQBQQQbQBQQQBB8bpB8Bbb88SEGbb;            .;;;,;,;,;;\"\n" +
                "echo \",;,,,;,;,;,;,;,;,;,;,;,;;;;;;;;;,;;;;; ..:....,;;zjSo5KoZ5jL;;;;;;;L;zFE8BQQBQBb88p8OGo3jz;;;73EKno8EF;38QQQBQQQQB8BBQbQbb8bbb8b8bpEKGObBL          ...;;;,;,;,;\"\n" +
                "echo \",,,,;,,,;,,,;,;,;,;,;,;;;;;,;,;;;,;;;;. ..:...,,;rno3j3ZKjzL;;;;;;r7jn35G5Oh5KKjZL; ,...::LhQggggbbO5y5GBBQQQQQBQBQbQBB8b8b8B8B8bpbSEGOGbQ;         ....,;;;;,,,\"\n" +
                "echo \":;,,,;,,,;,;,;,;,;,;,;,;;;;;;;;;;;;;;L,........,;FFLLnjjynFL,,,;;L;;;;::   ..  ,LjnKGBQgg@@@gQQQQQBbhoEbBQBQBQBBBQBQBB8bpb888bbb888S58EpO8pL.      ......:,;;;,;\"\n" +
                "echo \",,,,,,,,,,,,;,;,;,;,;,;,;,;,;;;;;;;;;;L. ...:...;zS;LnonK3KL;:.         .:;cjcFZpbQg@ggggQgQQbQQQQQbbG88BBQBQBBbQbBbB8bO8pb8BbB888boSpOOpO8cL:    ....: ....,;;;\"\n" +
                "echo \":;,,:,:,:,,;,;,;,;,;,;,;,;,;,;;;,;;;;;;;. ...,. :7nZzohpGOE5y;,;::...:;y5pO888O88BBQQQQQBQQQbQbQQQQQBB8B8bpB8BBB8Q8b8bOp8b8BbBbbO8Ohh8O8ObEz;;     ..,:. ......,\"\n" +
                "echo \",,;:,:,,;,,,;,;,;,;,;,;,;,;,;,;;;;;;;;;;; ...:;. :LjyrSObpGhSzL;L;;;,.,;FjooEhOE5KEG8bQBQQQQQBBQQQgQQBQbb8b88bQ888Bp8O88bpb8b88O88OnGE8EOOEL;:    ..:::.. ......\"\n" +
                "echo \":;,;:,:,,,,,,,,;,;,;,;,;,;,;,;;;,;,;;;;;;,  ..:;. .Lz77SpbpOZF7c;L;,...:,LcnzLLKn3n5OBBQBQQgBQBBbQQgQQBQ8b8QbBBB8b8bO888pb8b88pb8853EOOOGOK;..   .....::........\"\n" +
                "echo \"::,:,:,:,:,,,,,,,,,,;,,,;,;;;,;,;;;,;;;;;;:   .,;. .;;LyhhphS7Lr7LL;;,,:;;jK5zyKOEGS88bBQBBbb8BbQBQBQQQQQbbbb8bbbp8p8O8Ob8bpb88ObGSKEGpSpSj.    ................\"\n" +
                "echo \":;:,:,:,:,:;,;,;,;,;,;,;,;,;,;,;,;,;,;;;;;L.   .:;.  ,;7y35Go5;Lc7L7;L;Lco5Go53EEShOG88bO8OppbbQbBQQBQQQbBbB8B8b888b88Ob8B8b8pp8GpSS5pGOGS;.     ...............\"\n" +
                "echo \",:,:,:,:,:,,;,,,,,;,;,;,;,;,;,;,;,;;;;;,;;;;.   ..,.. .,LLFzyyF;rLrcyzyz3nKojFF7yjKoEObGESpO88QBQQQBQQQBBbBbBbb88Ob8b8b8B88pbObGOOGEOOGoOy.     ................\"\n" +
                "echo \":,:::,:,:,:,:,:,,,,,,;,;,;,;,;,;,;,;;;,;,;,;;. .   ... .:::;;L;rcz;nZ33on7;;;LLnKSSpG8p88b8BbQBQQQBQBQBB8bpb8b88Ob8b8bbBpb8b88G888GOGOEG3;     .................\"\n" +
                "echo \":::.,:,:,:,:,:,:,,,,;,;,;,;,;,;,;,;,;,;;;,;;L;. .   ........:,;;rLcz3h5rL;;;Fzo5OS8Ep8bpBBBBQBQBQBBbB8b8b8bpbO88b8B8b8b8bOb88O8O8pGG8SG3L     ....:.............\"\n" +
                "echo \":,.::::::,:,:,:,:,:;,,,;,;,,,;,;,;,;,;;;,;,;;;;. . . ..... . .:;;L;LLycL;LLynSSOEEhO8B8bbQBQBQQQBQ8bppO88b8b8b8B88pb88pBpbO8O8p8O8E8hE57.     ..................\"\n" +
                "echo \":::.,:,:,:,:,:,:,:,:,,,,;,;,;,;,;,;,;,;,;,;,;;;;. ... . ..... ..,,;;;;cL;;7nhZOEEEpO8bB8BbQQQQQbQb8EpO88bO8p88B8b88p8p8pbpbpbp8O8O8OpEj.    . . ......... ......\"\n" +
                "echo \".,.:.::,.,:::::,:,:,:,:,,;,;,;,,,;,;,;,;,;,;,;;c;  ... . ....  ..,,;;;;L;LLyjoEOhSOpObOb8BbQbBbbpphGO8pB8b8pb8bbp8O8O8O8p888p8Opp8ObOo.    . . ........... .....\"\n" +
                "echo \":::.,.::::::::,:,:,:,:,:,,,,,,;,;,;,,,;,;,;,;;LL   .. ... . ...  .::;,;;L;LLzyOK5oGSOGOpb8bO8GOGh5OObO8p888p8O8O8O8O8OpO8O8OOOOG8O8OZ:    . ....... ....... ... \"\n" +
                "echo \".,:,:,:,:,:,:,:,:,,,,;,;,,,;,;,;;;;;;;;;;;;;;;:    ..... . .....   ..::;;;,;;yooKGhGEOG8O8ppppSGOQBQQQBQBQBQbBbBbBBBbQbQBQBBbQBBbbGy.    ................... ...\"11");
                System.exit(0);
    }

}
