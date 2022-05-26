package coocent.music.player.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.un4seen.bass.BASS;
import com.un4seen.bass.BASS_FX;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import media.musicplayer.audioplayer.videoplayer.R;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class BPM extends Activity {

    /* renamed from: g */
    int f30356g;

    /* renamed from: h */
    int f30357h;

    /* renamed from: i */
    float f30358i;

    /* renamed from: j */
    BASS.BASS_CHANNELINFO f30359j = new BASS.BASS_CHANNELINFO();

    /* renamed from: k */
    Float f30360k;

    /* renamed from: l */
    int f30361l;

    /* renamed from: m */
    int f30362m;

    /* renamed from: n */
    File f30363n;

    /* renamed from: o */
    String[] f30364o;

    /* renamed from: p */
    int f30365p;

    /* renamed from: q */
    Object f30366q;

    /* renamed from: r */
    Timer f30367r;

    /* renamed from: s */
    TimerTask f30368s;

    /* renamed from: t */
    BASS_FX.BPMPROC f30369t;

    /* renamed from: u */
    BASS_FX.BPMBEATPROC f30370u;

    /* renamed from: v */
    BASS_FX.BPMPROGRESSPROC f30371v;

    /* renamed from: coocent.music.player.activity.BPM$a */
    class C6799a extends C6812k {
        C6799a(Object obj) {
            super(BPM.this, obj);
        }

        public void run() {
            new AlertDialog.Builder(BPM.this).setMessage((String) this.f30391g).setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$b */
    class C6800b implements BASS_FX.BPMPROC {

        /* renamed from: coocent.music.player.activity.BPM$b$a */
        class C6801a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ float f30374g;

            C6801a(float f) {
                this.f30374g = f;
            }

            public void run() {
                BPM bpm = BPM.this;
                float f = this.f30374g;
                bpm.f30358i = f;
                if (f > 0.0f) {
                    ((TextView) BPM.this.findViewById(R.id.txtBPM)).setText(String.format("BPM: %.2f", new Object[]{Float.valueOf(bpm.mo26462b(f))}));
                }
            }
        }

        C6800b() {
        }

        public void BPMPROC(int i, float f, Object obj) {
            BPM.this.runOnUiThread(new C6801a(f));
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$c */
    class C6802c implements BASS_FX.BPMBEATPROC {
        C6802c() {
        }

        public void BPMBEATPROC(int i, double d, Object obj) {
            double BASS_ChannelBytes2Seconds = BASS.BASS_ChannelBytes2Seconds(i, BASS.BASS_ChannelGetPosition(i, 0));
            BPM.this.f30367r = new Timer("alertTimer", true);
            BPM.this.f30368s = new C6813l(BPM.this, (C6799a) null);
            BPM bpm = BPM.this;
            bpm.f30367r.schedule(bpm.f30368s, ((long) (d - BASS_ChannelBytes2Seconds)) * 1000);
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$d */
    class C6803d implements BASS_FX.BPMPROGRESSPROC {

        /* renamed from: coocent.music.player.activity.BPM$d$a */
        class C6804a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ float f30378g;

            C6804a(float f) {
                this.f30378g = f;
            }

            public void run() {
                ((ProgressBar) BPM.this.findViewById(R.id.pbProgressBPM)).setProgress((int) this.f30378g);
            }
        }

        C6803d() {
        }

        public void BPMPROGRESSPROC(int i, float f, Object obj) {
            BPM.this.runOnUiThread(new C6804a(f));
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$e */
    class C6805e implements DialogInterface.OnClickListener {
        C6805e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            File file;
            if (BPM.this.f30364o[i].equals("..")) {
                file = BPM.this.f30363n.getParentFile();
            } else {
                BPM bpm = BPM.this;
                file = new File(bpm.f30363n, bpm.f30364o[i]);
            }
            if (file.isDirectory()) {
                BPM bpm2 = BPM.this;
                bpm2.f30363n = file;
                bpm2.OpenClicked((View) null);
                return;
            }
            String path = file.getPath();
            BASS_FX.BASS_FX_BPM_Free(BPM.this.f30357h);
            BASS.BASS_StreamFree(BPM.this.f30356g);
            ((Button) BPM.this.findViewById(R.id.open)).setText("press here to open a file & play it...");
            BPM bpm3 = BPM.this;
            int BASS_StreamCreateFile = BASS.BASS_StreamCreateFile(path, 0, 0, 2097152);
            bpm3.f30356g = BASS_StreamCreateFile;
            if (BASS_StreamCreateFile == 0) {
                BPM bpm4 = BPM.this;
                int BASS_MusicLoad = BASS.BASS_MusicLoad(path, 0, 0, 2228736, 1);
                bpm4.f30356g = BASS_MusicLoad;
                if (BASS_MusicLoad == 0) {
                    BPM.this.mo26461a("Selected file couldnt be loaded!");
                    return;
                }
            }
            BPM bpm5 = BPM.this;
            BASS.BASS_ChannelGetInfo(bpm5.f30356g, bpm5.f30359j);
            int i2 = BPM.this.f30356g;
            ((SeekBar) BPM.this.findViewById(R.id.sbPosition)).setMax((int) BASS.BASS_ChannelBytes2Seconds(i2, BASS.BASS_ChannelGetLength(i2, 0)));
            ((SeekBar) BPM.this.findViewById(R.id.sbPosition)).setProgress(0);
            BPM bpm6 = BPM.this;
            int BASS_FX_TempoCreate = BASS_FX.BASS_FX_TempoCreate(bpm6.f30356g, 65540);
            bpm6.f30356g = BASS_FX_TempoCreate;
            if (BASS_FX_TempoCreate == 0) {
                BPM.this.mo26461a("Couldnt create a resampled stream!");
                BASS.BASS_StreamFree(BPM.this.f30356g);
                return;
            }
            ((Button) BPM.this.findViewById(R.id.open)).setText(path);
            BPM bpm7 = BPM.this;
            bpm7.f30361l = (int) (bpm7.f30360k.floatValue() * 0.7f);
            BPM bpm8 = BPM.this;
            bpm8.f30362m = (int) (bpm8.f30360k.floatValue() * 1.3f);
            BPM bpm9 = BPM.this;
            ((SeekBar) BPM.this.findViewById(R.id.sbSamplerate)).setMax(bpm9.f30362m - bpm9.f30361l);
            ((SeekBar) BPM.this.findViewById(R.id.sbSamplerate)).setProgress(((SeekBar) BPM.this.findViewById(R.id.sbSamplerate)).getMax() / 2);
            ((TextView) BPM.this.findViewById(R.id.txtSamplerate)).setText("Samplerate = " + BPM.this.f30360k.intValue() + "Hz");
            ((SeekBar) BPM.this.findViewById(R.id.sbTempo)).setProgress(((SeekBar) BPM.this.findViewById(R.id.sbTempo)).getMax() / 2);
            ((TextView) BPM.this.findViewById(R.id.txtTempo)).setText("Tempo = 0%");
            BPM.this.mo26463c();
            ((TextView) BPM.this.findViewById(R.id.txtBeatPos)).setText("Beat pos: 0.00");
            ((TextView) BPM.this.findViewById(R.id.txtBPM)).setText("BPM: 0.00");
            BPM bpm10 = BPM.this;
            bpm10.ChkBeatPosClicked(bpm10.findViewById(R.id.chkBeatPos));
            BPM bpm11 = BPM.this;
            bpm11.ChkBPMClicked(bpm11.findViewById(R.id.chkBPM));
            BASS.BASS_ChannelPlay(BPM.this.f30356g, false);
            double progress = (double) ((SeekBar) BPM.this.findViewById(R.id.sbPosition)).getProgress();
            double parseDouble = Double.parseDouble(((EditText) BPM.this.findViewById(R.id.etxtBPM)).getText().toString());
            double max = (double) ((SeekBar) BPM.this.findViewById(R.id.sbPosition)).getMax();
            BPM bpm12 = BPM.this;
            double d = parseDouble + progress;
            if (d >= max) {
                d = max - 1.0d;
            }
            new Thread(new C6810j(true, progress, d, path)).start();
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$f */
    class C6806f implements View.OnTouchListener {
        C6806f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ((EditText) BPM.this.findViewById(R.id.etxtBPM)).setFocusable(true);
            ((EditText) BPM.this.findViewById(R.id.etxtBPM)).setFocusableInTouchMode(true);
            return false;
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$g */
    class C6807g implements SeekBar.OnSeekBarChangeListener {
        C6807g() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (BASS.BASS_ChannelIsActive(BPM.this.f30356g) != 0) {
                BASS.BASS_ChannelSetAttribute(BPM.this.f30356g, 65536, (float) (i - (seekBar.getMax() / 2)));
                BPM bpm = BPM.this;
                ((TextView) BPM.this.findViewById(R.id.txtBPM)).setText(String.format("BPM: %.2f", new Object[]{Float.valueOf(bpm.mo26462b(bpm.f30358i))}));
                ((TextView) BPM.this.findViewById(R.id.txtTempo)).setText(String.format("Tempo = %d%%", new Object[]{Integer.valueOf(i - (seekBar.getMax() / 2))}));
                BPM.this.mo26463c();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$h */
    class C6808h implements SeekBar.OnSeekBarChangeListener {
        C6808h() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (BASS.BASS_ChannelIsActive(BPM.this.f30356g) != 0) {
                BPM bpm = BPM.this;
                BASS.BASS_ChannelSetAttribute(bpm.f30356g, 65538, (float) (bpm.f30361l + i));
                BPM bpm2 = BPM.this;
                ((TextView) BPM.this.findViewById(R.id.txtBPM)).setText(String.format("BPM: %.2f", new Object[]{Float.valueOf(bpm2.mo26462b(bpm2.f30358i))}));
                ((TextView) BPM.this.findViewById(R.id.txtSamplerate)).setText(String.format("Samplerate = %dHz", new Object[]{Integer.valueOf(i + BPM.this.f30361l)}));
                BPM.this.mo26463c();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$i */
    class C6809i implements SeekBar.OnSeekBarChangeListener {
        C6809i() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            BPM.this.mo26463c();
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int i = BPM.this.f30356g;
            BASS.BASS_ChannelSetPosition(i, BASS.BASS_ChannelSeconds2Bytes(i, (double) seekBar.getProgress()), 0);
            double progress = (double) seekBar.getProgress();
            double parseDouble = Double.parseDouble(((EditText) BPM.this.findViewById(R.id.etxtBPM)).getText().toString());
            double max = (double) seekBar.getMax();
            double d = parseDouble + progress;
            new Thread(new C6810j(false, progress, d >= max ? max - 1.0d : d, BuildConfig.FLAVOR)).start();
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$j */
    public class C6810j implements Runnable {

        /* renamed from: g */
        boolean f30385g;

        /* renamed from: h */
        double f30386h;

        /* renamed from: i */
        double f30387i;

        /* renamed from: j */
        String f30388j;

        /* renamed from: coocent.music.player.activity.BPM$j$a */
        class C6811a implements Runnable {
            C6811a() {
            }

            public void run() {
                BPM bpm = BPM.this;
                ((TextView) BPM.this.findViewById(R.id.txtBPM)).setText(String.format("BPM: %.2f", new Object[]{Float.valueOf(bpm.mo26462b(bpm.f30358i))}));
            }
        }

        public C6810j(boolean z, double d, double d2, String str) {
            this.f30385g = z;
            this.f30386h = d;
            this.f30387i = d2;
            this.f30388j = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
            r5 = r4.f30357h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
            if (r5 == 0) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
            r4.f30358i = com.un4seen.bass.BASS_FX.BASS_FX_BPM_DecodeGet(r5, r14.f30386h, r14.f30387i, 0, 65538, r4.f30371v, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
            r0 = r14.f30389k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
            if (r0.f30358i == 0.0f) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
            r0.runOnUiThread(new coocent.music.player.activity.BPM.C6810j.C6811a(r14));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
                coocent.music.player.activity.BPM r0 = coocent.music.player.activity.BPM.this
                java.lang.Object r0 = r0.f30366q
                monitor-enter(r0)
                coocent.music.player.activity.BPM r1 = coocent.music.player.activity.BPM.this     // Catch:{ all -> 0x0079 }
                int r2 = r1.f30365p     // Catch:{ all -> 0x0079 }
                int r2 = r2 + 1
                r1.f30365p = r2     // Catch:{ all -> 0x0079 }
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                boolean r0 = r14.f30385g
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.lang.String r3 = r14.f30388j
                r4 = 0
                r6 = 0
                r8 = 2097152(0x200000, float:2.938736E-39)
                int r0 = com.un4seen.bass.BASS.BASS_StreamCreateFile((java.lang.String) r3, (long) r4, (long) r6, (int) r8)
                if (r0 != 0) goto L_0x002f
                java.lang.String r3 = r14.f30388j
                r4 = 0
                r6 = 0
                r7 = 2228224(0x220000, float:3.122407E-39)
                r8 = 0
                int r0 = com.un4seen.bass.BASS.BASS_MusicLoad((java.lang.String) r3, (long) r4, (int) r6, (int) r7, (int) r8)
                goto L_0x002f
            L_0x002e:
                r0 = 0
            L_0x002f:
                coocent.music.player.activity.BPM r3 = coocent.music.player.activity.BPM.this
                java.lang.Object r3 = r3.f30366q
                monitor-enter(r3)
                coocent.music.player.activity.BPM r4 = coocent.music.player.activity.BPM.this     // Catch:{ all -> 0x0076 }
                int r5 = r4.f30365p     // Catch:{ all -> 0x0076 }
                if (r2 == r5) goto L_0x0045
                boolean r2 = r14.f30385g     // Catch:{ all -> 0x0076 }
                if (r2 == 0) goto L_0x0045
                if (r0 == 0) goto L_0x0043
                com.un4seen.bass.BASS.BASS_StreamFree(r0)     // Catch:{ all -> 0x0076 }
            L_0x0043:
                monitor-exit(r3)     // Catch:{ all -> 0x0076 }
                return
            L_0x0045:
                boolean r2 = r14.f30385g     // Catch:{ all -> 0x0076 }
                if (r2 == 0) goto L_0x004b
                r4.f30357h = r0     // Catch:{ all -> 0x0076 }
            L_0x004b:
                monitor-exit(r3)     // Catch:{ all -> 0x0076 }
                int r5 = r4.f30357h
                if (r5 == 0) goto L_0x0064
                double r6 = r14.f30386h
                double r8 = r14.f30387i
                r10 = 0
                r11 = 65538(0x10002, float:9.1838E-41)
                com.un4seen.bass.BASS_FX$BPMPROGRESSPROC r12 = r4.f30371v
                java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
                float r0 = com.un4seen.bass.BASS_FX.BASS_FX_BPM_DecodeGet(r5, r6, r8, r10, r11, r12, r13)
                r4.f30358i = r0
            L_0x0064:
                coocent.music.player.activity.BPM r0 = coocent.music.player.activity.BPM.this
                float r1 = r0.f30358i
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 == 0) goto L_0x0075
                coocent.music.player.activity.BPM$j$a r1 = new coocent.music.player.activity.BPM$j$a
                r1.<init>()
                r0.runOnUiThread(r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0076 }
                throw r0
            L_0x0079:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.activity.BPM.C6810j.run():void");
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$k */
    class C6812k implements Runnable {

        /* renamed from: g */
        Object f30391g;

        C6812k(BPM bpm, Object obj) {
            this.f30391g = obj;
        }
    }

    /* renamed from: coocent.music.player.activity.BPM$l */
    private class C6813l extends TimerTask {

        /* renamed from: coocent.music.player.activity.BPM$l$a */
        class C6814a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ double f30393g;

            C6814a(double d) {
                this.f30393g = d;
            }

            public void run() {
                ((TextView) BPM.this.findViewById(R.id.txtBeatPos)).setText(String.format("Beat pos: %.2f", new Object[]{Double.valueOf(this.f30393g)}));
            }
        }

        private C6813l() {
        }

        public void run() {
            if (BASS_FX.BASS_FX_TempoGetRateRatio(BPM.this.f30356g) != 0.0f) {
                int i = BPM.this.f30356g;
                BPM.this.runOnUiThread(new C6814a(BASS.BASS_ChannelBytes2Seconds(i, BASS.BASS_ChannelGetPosition(i, 0)) / ((double) BASS_FX.BASS_FX_TempoGetRateRatio(BPM.this.f30356g))));
            }
            BPM.this.f30367r.cancel();
        }

        /* synthetic */ C6813l(BPM bpm, C6799a aVar) {
            this();
        }
    }

    public BPM() {
        Float valueOf = Float.valueOf(44100.0f);
        this.f30360k = valueOf;
        this.f30361l = (int) (valueOf.floatValue() * 0.7f);
        this.f30366q = new Object();
        this.f30369t = new C6800b();
        this.f30370u = new C6802c();
        this.f30371v = new C6803d();
    }

    public void ChkBPMClicked(View view) {
        if (((CheckBox) view).isChecked()) {
            BASS_FX.BASS_FX_BPM_CallbackSet(this.f30356g, this.f30369t, Double.parseDouble(((EditText) findViewById(R.id.etxtBPM)).getText().toString()), 0, 2, 0);
        } else {
            BASS_FX.BASS_FX_BPM_Free(this.f30356g);
        }
    }

    public void ChkBeatPosClicked(View view) {
        if (((CheckBox) view).isChecked()) {
            BASS_FX.BASS_FX_BPM_BeatCallbackSet(this.f30356g, this.f30370u, 0);
        } else {
            BASS_FX.BASS_FX_BPM_BeatFree(this.f30356g);
        }
    }

    public void OpenClicked(View view) {
        String[] list = this.f30363n.list();
        if (list == null) {
            list = new String[0];
        }
        if (!this.f30363n.getPath().equals("/")) {
            String[] strArr = new String[(list.length + 1)];
            this.f30364o = strArr;
            strArr[0] = "..";
            System.arraycopy(list, 0, strArr, 1, list.length);
        } else {
            this.f30364o = list;
        }
        new AlertDialog.Builder(this).setTitle("Choose a file to play").setItems(this.f30364o, new C6805e()).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo26461a(String str) {
        runOnUiThread(new C6799a(String.format("%s\n(error code: %d)", new Object[]{str, Integer.valueOf(BASS.BASS_ErrorGetCode())})));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo26462b(float f) {
        return f * BASS_FX.BASS_FX_TempoGetRateRatio(this.f30356g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26463c() {
        if (BASS_FX.BASS_FX_TempoGetRateRatio(this.f30356g) != 0.0f) {
            float max = ((float) ((SeekBar) findViewById(R.id.sbPosition)).getMax()) / BASS_FX.BASS_FX_TempoGetRateRatio(this.f30356g);
            int progress = (int) (((float) ((SeekBar) findViewById(R.id.sbPosition)).getProgress()) / BASS_FX.BASS_FX_TempoGetRateRatio(this.f30356g));
            int i = (int) max;
            ((TextView) findViewById(R.id.txtPos)).setText(String.format("Playing position: %02d:%02d / %02d:%02d", new Object[]{Integer.valueOf(progress / 60), Integer.valueOf(progress % 60), Integer.valueOf(i / 60), Integer.valueOf(i % 60)}));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b_main);
        this.f30363n = Environment.getExternalStorageDirectory();
        this.f30363n = new File("/mnt/sdcard");
        if (!BASS.BASS_Init(-1, 44100, 0)) {
            mo26461a("Can't initialize device");
            return;
        }
        ((EditText) findViewById(R.id.etxtBPM)).setOnTouchListener(new C6806f());
        ((SeekBar) findViewById(R.id.sbTempo)).setOnSeekBarChangeListener(new C6807g());
        ((SeekBar) findViewById(R.id.sbSamplerate)).setOnSeekBarChangeListener(new C6808h());
        ((SeekBar) findViewById(R.id.sbPosition)).setOnSeekBarChangeListener(new C6809i());
    }

    public void onDestroy() {
        BASS.BASS_Free();
        super.onDestroy();
    }
}
