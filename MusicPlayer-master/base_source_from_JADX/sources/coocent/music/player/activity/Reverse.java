package coocent.music.player.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.un4seen.bass.BASS;
import com.un4seen.bass.BASS_FX;
import java.io.File;
import media.musicplayer.audioplayer.videoplayer.R;

public class Reverse extends Activity {

    /* renamed from: g */
    int f30766g;

    /* renamed from: h */
    int f30767h;

    /* renamed from: i */
    File f30768i;

    /* renamed from: j */
    String[] f30769j;

    /* renamed from: coocent.music.player.activity.Reverse$a */
    class C6891a extends C6897g {
        C6891a(Object obj) {
            super(Reverse.this, obj);
        }

        public void run() {
            new AlertDialog.Builder(Reverse.this).setMessage((String) this.f30776g).setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
        }
    }

    /* renamed from: coocent.music.player.activity.Reverse$b */
    class C6892b implements DialogInterface.OnClickListener {
        C6892b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            File file;
            if (Reverse.this.f30769j[i].equals("..")) {
                file = Reverse.this.f30768i.getParentFile();
            } else {
                Reverse reverse = Reverse.this;
                file = new File(reverse.f30768i, reverse.f30769j[i]);
            }
            if (file.isDirectory()) {
                Reverse reverse2 = Reverse.this;
                reverse2.f30768i = file;
                reverse2.OpenClicked((View) null);
                return;
            }
            String path = file.getPath();
            BASS.BASS_StreamFree(Reverse.this.f30766g);
            ((Button) Reverse.this.findViewById(R.id.open)).setText("press here to open a file & play it...");
            Reverse reverse3 = Reverse.this;
            int BASS_StreamCreateFile = BASS.BASS_StreamCreateFile(path, 0, 0, 2228224);
            reverse3.f30766g = BASS_StreamCreateFile;
            if (BASS_StreamCreateFile == 0) {
                Reverse reverse4 = Reverse.this;
                int BASS_MusicLoad = BASS.BASS_MusicLoad(path, 0, 0, 2228736, 0);
                reverse4.f30766g = BASS_MusicLoad;
                if (BASS_MusicLoad == 0) {
                    Reverse.this.mo26734a("Selected file couldnt be loaded!");
                    return;
                }
            }
            Reverse reverse5 = Reverse.this;
            int BASS_FX_ReverseCreate = BASS_FX.BASS_FX_ReverseCreate(reverse5.f30766g, 2.0f, 2162688);
            reverse5.f30766g = BASS_FX_ReverseCreate;
            if (BASS_FX_ReverseCreate == 0) {
                Reverse.this.mo26734a("Couldnt create a reversed stream!");
                BASS.BASS_StreamFree(Reverse.this.f30766g);
                return;
            }
            Reverse reverse6 = Reverse.this;
            int BASS_FX_TempoCreate = BASS_FX.BASS_FX_TempoCreate(reverse6.f30766g, 65540);
            reverse6.f30766g = BASS_FX_TempoCreate;
            if (BASS_FX_TempoCreate == 0) {
                Reverse.this.mo26734a("Couldnt create a resampled stream!");
                BASS.BASS_StreamFree(Reverse.this.f30766g);
                return;
            }
            ((Button) Reverse.this.findViewById(R.id.open)).setText(path);
            ((SeekBar) Reverse.this.findViewById(R.id.sbTempo)).setProgress(((SeekBar) Reverse.this.findViewById(R.id.sbTempo)).getMax() / 2);
            ((TextView) Reverse.this.findViewById(R.id.txtTempo)).setText("Tempo = 0%");
            Reverse reverse7 = Reverse.this;
            reverse7.f30767h = BASS.BASS_ChannelSetFX(reverse7.f30766g, 8, 0);
            Reverse reverse8 = Reverse.this;
            reverse8.mo26735b(((SeekBar) reverse8.findViewById(R.id.reverb)).getProgress());
            BASS.BASS_ChannelSetAttribute(Reverse.this.f30766g, 2, ((float) ((SeekBar) Reverse.this.findViewById(R.id.sbVolume)).getProgress()) / 100.0f);
            int i2 = Reverse.this.f30766g;
            int BASS_ChannelBytes2Seconds = (int) BASS.BASS_ChannelBytes2Seconds(i2, BASS.BASS_ChannelGetLength(i2, 0));
            ((SeekBar) Reverse.this.findViewById(R.id.sbPosition)).setMax(BASS_ChannelBytes2Seconds);
            ((SeekBar) Reverse.this.findViewById(R.id.sbPosition)).setProgress(BASS_ChannelBytes2Seconds);
            Reverse.this.mo26736c();
            ((Button) Reverse.this.findViewById(R.id.btnDirection)).setText("Playing Direction - Reverse");
            BASS.BASS_ChannelPlay(Reverse.this.f30766g, false);
        }
    }

    /* renamed from: coocent.music.player.activity.Reverse$c */
    class C6893c implements SeekBar.OnSeekBarChangeListener {
        C6893c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            BASS.BASS_ChannelSetAttribute(Reverse.this.f30766g, 2, ((float) i) / 100.0f);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.Reverse$d */
    class C6894d implements SeekBar.OnSeekBarChangeListener {
        C6894d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Reverse.this.mo26735b(i);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.Reverse$e */
    class C6895e implements SeekBar.OnSeekBarChangeListener {
        C6895e() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            BASS.BASS_ChannelSetAttribute(Reverse.this.f30766g, 65536, (float) (i - (seekBar.getMax() / 2)));
            ((TextView) Reverse.this.findViewById(R.id.txtTempo)).setText(String.format("Tempo = %d%%", new Object[]{Integer.valueOf(i - (seekBar.getMax() / 2))}));
            Reverse.this.mo26736c();
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.Reverse$f */
    class C6896f implements SeekBar.OnSeekBarChangeListener {
        C6896f() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Reverse.this.mo26736c();
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int i = Reverse.this.f30766g;
            BASS.BASS_ChannelSetPosition(i, BASS.BASS_ChannelSeconds2Bytes(i, (double) seekBar.getProgress()), 0);
        }
    }

    /* renamed from: coocent.music.player.activity.Reverse$g */
    class C6897g implements Runnable {

        /* renamed from: g */
        Object f30776g;

        C6897g(Reverse reverse, Object obj) {
            this.f30776g = obj;
        }
    }

    public void DirectionClicked(View view) {
        int BASS_FX_TempoGetSource = BASS_FX.BASS_FX_TempoGetSource(this.f30766g);
        Float valueOf = Float.valueOf(0.0f);
        BASS.BASS_ChannelGetAttribute(BASS_FX_TempoGetSource, BASS_FX.BASS_ATTRIB_REVERSE_DIR, valueOf);
        if (valueOf.floatValue() < 0.0f) {
            BASS.BASS_ChannelSetAttribute(BASS_FX_TempoGetSource, BASS_FX.BASS_ATTRIB_REVERSE_DIR, 1.0f);
            ((Button) findViewById(R.id.btnDirection)).setText("Playing Direction - Forward");
            return;
        }
        BASS.BASS_ChannelSetAttribute(BASS_FX_TempoGetSource, BASS_FX.BASS_ATTRIB_REVERSE_DIR, -1.0f);
        ((Button) findViewById(R.id.btnDirection)).setText("Playing Direction - Reverse");
    }

    public void OpenClicked(View view) {
        String[] list = this.f30768i.list();
        if (list == null) {
            list = new String[0];
        }
        if (!this.f30768i.getPath().equals("/")) {
            String[] strArr = new String[(list.length + 1)];
            this.f30769j = strArr;
            strArr[0] = "..";
            System.arraycopy(list, 0, strArr, 1, list.length);
        } else {
            this.f30769j = list;
        }
        new AlertDialog.Builder(this).setTitle("Choose a file to play").setItems(this.f30769j, new C6892b()).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo26734a(String str) {
        runOnUiThread(new C6891a(String.format("%s\n(error code: %d)", new Object[]{str, Integer.valueOf(BASS.BASS_ErrorGetCode())})));
    }

    /* renamed from: b */
    public void mo26735b(int i) {
        BASS.BASS_DX8_REVERB bass_dx8_reverb = new BASS.BASS_DX8_REVERB();
        Log.e("reverse", "progress:" + i);
        BASS.BASS_FXGetParameters(this.f30767h, bass_dx8_reverb);
        bass_dx8_reverb.fReverbMix = (float) (i != 0 ? Math.log(((double) i) / 20.0d) * 20.0d : -96.0d);
        Log.e("reverse", "v:" + bass_dx8_reverb.fReverbMix);
        BASS.BASS_FXSetParameters(this.f30767h, bass_dx8_reverb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26736c() {
        if (BASS_FX.BASS_FX_TempoGetRateRatio(this.f30766g) != 0.0f) {
            float max = ((float) ((SeekBar) findViewById(R.id.sbPosition)).getMax()) / BASS_FX.BASS_FX_TempoGetRateRatio(this.f30766g);
            int progress = (int) (((float) ((SeekBar) findViewById(R.id.sbPosition)).getProgress()) / BASS_FX.BASS_FX_TempoGetRateRatio(this.f30766g));
            int i = (int) max;
            ((TextView) findViewById(R.id.txtPos)).setText(String.format("Playing position: %02d:%02d / %02d:%02d", new Object[]{Integer.valueOf(progress / 60), Integer.valueOf(progress % 60), Integer.valueOf(i / 60), Integer.valueOf(i % 60)}));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        this.f30768i = Environment.getExternalStorageDirectory();
        this.f30768i = new File("/mnt/sdcard");
        if (!BASS.BASS_Init(-1, 44100, 0)) {
            mo26734a("Can't initialize device");
            return;
        }
        ((SeekBar) findViewById(R.id.sbVolume)).setOnSeekBarChangeListener(new C6893c());
        ((SeekBar) findViewById(R.id.reverb)).setOnSeekBarChangeListener(new C6894d());
        ((SeekBar) findViewById(R.id.sbTempo)).setOnSeekBarChangeListener(new C6895e());
        ((SeekBar) findViewById(R.id.sbPosition)).setOnSeekBarChangeListener(new C6896f());
    }

    public void onDestroy() {
        BASS.BASS_Free();
        super.onDestroy();
    }
}
