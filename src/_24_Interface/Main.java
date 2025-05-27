package _24_Interface;

public class Main {
    public static void main(String[] args) {

        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        System.out.println();

        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        System.out.println();

        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();

        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
        System.out.println();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();

    }
}
