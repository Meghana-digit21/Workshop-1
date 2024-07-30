package SImpleMessagingSystem;

public class Chat {
        public static void main(String[] args) {
            //user objext
            User meg = new User("Meg");
            User joe = new User("Joe");

            Message textMsg = new TextMsg("Wassup Joe", meg);
            Message mediaMsg = new MediaMsg("Check out this picture", joe, "https://www.google.com/search?q=image&safe=active&sca_esv=fa70f7cd442e3964&sca_upv=1&rlz=1C1GCEU_enIN1116IN1117&udm=2&source=iu&ictx=1&vet=1&fir=B_ypq20yGKrazM%252C6dhDHhJGcmvL6M%252C%252Fm%252F0jg24%253BsKMM4eBjWSQEBM%252CB51x0PBR9KNzvM%252C_%253BD2e1clQQJsbJwM%252C-t22bY2ix3gHaM%252C_%253BCngZjJWulfoSoM%252CQooZsUX3wOLfLM%252C_%253B0kl2WrGN8BrkhM%252CKEFtss0dYCDpzM%252C_&usg=AI4_-kT3AhJS2D80eCKPqRbC-sCSkyv0Mg&sa=X&ved=2ahUKEwia5t3ZkM6HAxVKyzgGHf1mMmAQ_B16BAgqEAE#vhid=B_ypq20yGKrazM&vssid=mosaic");

            meg.sendMessage(joe, textMsg);
            joe.sendMessage(meg, mediaMsg);


            joe.displayInbox();
            meg.displayInbox();
        }

}

















