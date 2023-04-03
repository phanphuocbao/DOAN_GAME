package doan.dev;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

import doan.dev.handlers.FacebookHandler;
import doan.dev.handlers.GameServicesHandler;
import doan.dev.handlers.RequestHandler;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
//        config.width = 800;
//        config.height = 480;
        new Lwjgl3Application(new Main(handler, gameHandler, faceHandler), config);
    }

    static RequestHandler handler = new RequestHandler() {

        @Override
        public void showRater() {
            // TODO Auto-generated method stub

        }

        @Override
        public void showInterstitial() {
            // TODO Auto-generated method stub

        }

        @Override
        public void showAdBanner() {
            // TODO Auto-generated method stub

        }

        @Override
        public void showMoreGames() {
            Gdx.net.openURI("https://play.google.com/");
        }

        @Override
        public void shareOnTwitter(String mensaje) {
            String tweetUrl = "https://twitter.com/intent/tweet?text=" + mensaje + " Download it from &url=https://play.google.com/&hashtags=SharkAdventure";
            Gdx.net.openURI(tweetUrl);
        }

        @Override
        public void removeAds() {
            // TODO Auto-generated method stub

        }

        @Override
        public void hideAdBanner() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy5milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy50milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy30milCoins() {
            // TODO Auto-generated method stub

        }

        @Override
        public void buy15milCoins() {
            // TODO Auto-generated method stub

        }
    };

    static GameServicesHandler gameHandler = new GameServicesHandler() {

        @Override
        public void unlockAchievement(String achievementId) {
            // TODO Auto-generated method stub

        }

        @Override
        public void submitScore(long score) {
            // TODO Auto-generated method stub

        }

        @Override
        public void signOut() {
            // TODO Auto-generated method stub

        }

        @Override
        public void signIn() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean isSignedIn() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void getLeaderboard() {
            // TODO Auto-generated method stub

        }

        @Override
        public void getAchievements() {
            // TODO Auto-generated method stub

        }
    };

    static FacebookHandler faceHandler = new FacebookHandler() {

        @Override
        public void showFacebook() {
            Gdx.net.openURI("https://www.facebook.com");
        }


        @Override
        public void facebookSignOut() {
            // TODO Auto-generated method stub

        }

        @Override
        public void facebookSignIn() {
            // TODO Auto-generated method stub

        }

        @Override
        public void facebookShareFeed(String message) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean facebookIsSignedIn() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void facebookInviteFriends(String message) {
            // TODO Auto-generated method stub

        }
    };
}
