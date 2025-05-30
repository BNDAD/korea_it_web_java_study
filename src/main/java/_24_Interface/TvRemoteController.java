package _24_Interface;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        System.out.print("Tv의 ");
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        System.out.print("Tv의 ");
        channelDownButton.onDown();
    }
    public void onPressedChannelUpButton() {
        System.out.print("Tv의 ");
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        System.out.print("Tv의 ");
        channelUpButton.onUp();
    }
    public void onPressedVolumeUpButton() {
        System.out.print("Tv의 ");
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        System.out.print("Tv의 ");
        volumeUpButton.onUp();
    }
    public void onPressedVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onDown();
    }
}
