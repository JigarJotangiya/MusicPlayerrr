package p159f.p166c.p181e.p182a.p183a.p189f;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.Objects;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.f.a */
/* compiled from: AudioFocusManager.kt */
public final class C4430a {

    /* renamed from: a */
    private static AudioManager.OnAudioFocusChangeListener f13004a;

    /* renamed from: b */
    private static AudioAttributes f13005b;

    /* renamed from: c */
    private static AudioFocusRequest f13006c;

    /* renamed from: d */
    private static AudioManager f13007d;

    /* renamed from: e */
    public static final C4430a f13008e = new C4430a();

    /* renamed from: f.c.e.a.a.f.a$a */
    /* compiled from: AudioFocusManager.kt */
    public interface C4431a {
        /* renamed from: a */
        void mo15009a();

        /* renamed from: b */
        void mo15010b();

        /* renamed from: c */
        void mo15011c();

        /* renamed from: d */
        void mo15012d();
    }

    /* renamed from: f.c.e.a.a.f.a$b */
    /* compiled from: AudioFocusManager.kt */
    static final class C4432b implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4431a f13009a;

        C4432b(C4431a aVar) {
            this.f13009a = aVar;
        }

        public final void onAudioFocusChange(int i) {
            if (i == -3) {
                this.f13009a.mo15011c();
            } else if (i == -2) {
                this.f13009a.mo15010b();
            } else if (i == -1) {
                this.f13009a.mo15012d();
            } else if (i == 1) {
                this.f13009a.mo15009a();
            }
        }
    }

    private C4430a() {
    }

    /* renamed from: a */
    private final void m19356a() {
        f13004a = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f13005b = null;
        }
        if (i >= 26) {
            f13006c = null;
        }
    }

    /* renamed from: b */
    public final void mo15007b(Context context) {
        AudioManager audioManager;
        C8594l.m46771e(context, "context");
        if (f13007d == null) {
            Object systemService = context.getSystemService("audio");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            f13007d = (AudioManager) systemService;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = f13006c;
            if (audioFocusRequest != null && (audioManager = f13007d) != null) {
                audioManager.requestAudioFocus(audioFocusRequest);
                return;
            }
            return;
        }
        AudioManager audioManager2 = f13007d;
        if (audioManager2 != null) {
            audioManager2.requestAudioFocus(f13004a, 3, 1);
        }
    }

    /* renamed from: c */
    public final void mo15008c(C4431a aVar) {
        C8594l.m46771e(aVar, "focusChangeListener");
        m19356a();
        f13004a = new C4432b(aVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f13005b = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        }
        if (i >= 26) {
            AudioFocusRequest.Builder acceptsDelayedFocusGain = new AudioFocusRequest.Builder(1).setWillPauseWhenDucked(true).setAcceptsDelayedFocusGain(true);
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = f13004a;
            C8594l.m46769c(onAudioFocusChangeListener);
            AudioFocusRequest.Builder onAudioFocusChangeListener2 = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
            AudioAttributes audioAttributes = f13005b;
            C8594l.m46769c(audioAttributes);
            f13006c = onAudioFocusChangeListener2.setAudioAttributes(audioAttributes).build();
        }
    }
}
