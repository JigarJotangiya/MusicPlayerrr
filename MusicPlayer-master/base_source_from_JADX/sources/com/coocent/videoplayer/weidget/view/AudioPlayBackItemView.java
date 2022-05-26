package com.coocent.videoplayer.weidget.view;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0133c;
import androidx.core.content.C0506a;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.video.videoplayercore.service.IAudioPlay;
import com.coocent.videoplayer.C2705l;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import com.coocent.videoplayer.C2708o;
import com.coocent.videoplayer.C2709p;
import com.coocent.videoplayer.VideoPlayerActivity;
import com.coocent.videoplayer.p061s.C2723c;
import com.coocent.videoplayer.p062t.p065c.C2749h;
import com.coocent.videostore.p067po.Video;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: AudioPlayBackItemView.kt */
public final class AudioPlayBackItemView extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RelativeLayout f9481g;

    /* renamed from: h */
    private ImageView f9482h;

    /* renamed from: i */
    private RelativeLayout f9483i;

    /* renamed from: j */
    private ImageView f9484j;

    /* renamed from: k */
    private TextView f9485k;

    /* renamed from: l */
    private TextView f9486l;

    /* renamed from: m */
    private ImageView f9487m;

    /* renamed from: n */
    private ImageView f9488n;

    /* renamed from: o */
    private boolean f9489o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2749h f9490p;

    /* renamed from: com.coocent.videoplayer.weidget.view.AudioPlayBackItemView$a */
    /* compiled from: AudioPlayBackItemView.kt */
    public static final class C2775a implements IAudioPlay {

        /* renamed from: a */
        final /* synthetic */ AudioPlayBackItemView f9491a;

        /* renamed from: b */
        final /* synthetic */ AudioPlayService f9492b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f9493c;

        C2775a(AudioPlayBackItemView audioPlayBackItemView, AudioPlayService audioPlayService, FragmentActivity fragmentActivity) {
            this.f9491a = audioPlayBackItemView;
            this.f9492b = audioPlayService;
            this.f9493c = fragmentActivity;
        }

        public void onAudioPlay(String str, String str2, int i, long j) {
            C8594l.m46771e(str, "title");
            C8594l.m46771e(str2, "thumbnail");
            this.f9491a.m12541u(str, str2);
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10309m3(this.f9492b.playingPosition(), this.f9492b.playingVideo());
            }
        }

        public void onAudioPlayExit() {
            this.f9491a.setVisibility(8);
            RelativeLayout b = this.f9491a.f9481g;
            if (b != null) {
                b.setVisibility(8);
            }
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo3831X2();
            }
        }

        public void onAudioPlayNext(String str, String str2, int i, long j) {
            C8594l.m46771e(str, "title");
            C8594l.m46771e(str2, "thumbnail");
            this.f9491a.m12541u(str, str2);
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10309m3(this.f9492b.playingPosition(), this.f9492b.playingVideo());
            }
        }

        public void onAudioPlayPrevious(String str, String str2, int i, long j) {
            C8594l.m46771e(str, "title");
            C8594l.m46771e(str2, "thumbnail");
            this.f9491a.m12541u(str, str2);
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10309m3(this.f9492b.playingPosition(), this.f9492b.playingVideo());
            }
        }

        public void onAudioPlayTime(String str, int i, long j) {
            C8594l.m46771e(str, "playTime");
            this.f9491a.m12543w(str, j);
        }

        public void onAudioReTitle(Video video, String str) {
            C8594l.m46771e(video, "reVideo");
            C8594l.m46771e(str, "title");
            Video playingVideo = this.f9492b.playingVideo();
            if (playingVideo != null) {
                AudioPlayBackItemView audioPlayBackItemView = this.f9491a;
                if (playingVideo.mo10553l() == video.mo10553l()) {
                    audioPlayBackItemView.m12541u(str, video.mo10564v());
                }
            }
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10311o3(video, str);
            }
        }

        public void onAudioSwitchMode(int i) {
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10312p3(this.f9493c, i);
            }
        }

        public void onClickNotification() {
            Intent intent = new Intent(this.f9493c, VideoPlayerActivity.class);
            intent.addFlags(268435456);
            Intent intent2 = new Intent();
            intent2.setAction(C8594l.m46777k(this.f9493c.getPackageName(), ".video.list"));
            intent2.addFlags(268435456);
            Intent intent3 = new Intent();
            intent3.setAction(C8594l.m46777k(this.f9492b.getPackageName(), ".video.main"));
            intent3.addFlags(268435456);
            try {
                PendingIntent.getActivities(this.f9493c, 0, new Intent[]{intent3, intent2, intent}, 134217728).send();
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
                try {
                    this.f9493c.startActivities(new Intent[]{intent3, intent2, intent});
                } catch (ActivityNotFoundException unused) {
                    this.f9493c.startActivities(new Intent[]{intent});
                }
            }
            PlayerHelper.Companion.getInstance(this.f9493c).isAudioPlay(false);
            this.f9493c.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_EXIT()));
        }

        public void onClickPosition(int i) {
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10309m3(i, this.f9492b.playingVideo());
            }
        }

        public void onPauseOrResume(boolean z) {
            this.f9491a.m12542v(z);
        }

        public void onRemoveVideoPosition(Video video, int i) {
            C8594l.m46771e(video, "removeVideo");
            C2749h a = this.f9491a.f9490p;
            if (a != null) {
                a.mo10310n3(i, this.f9492b.playingVideos().size());
            }
            Video playingVideo = this.f9492b.playingVideo();
            if (playingVideo != null) {
                this.f9491a.m12541u(playingVideo.mo10565w(), playingVideo.mo10564v());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayBackItemView(Context context) {
        super(context);
        C8594l.m46771e(context, "context");
        m12527f(context);
    }

    /* renamed from: f */
    private final void m12527f(Context context) {
        LayoutInflater.from(context).inflate(C2707n.video_layout_dialog_audio, this);
        this.f9481g = (RelativeLayout) findViewById(C2706m.rl_item);
        this.f9482h = (ImageView) findViewById(C2706m.iv_music);
        this.f9483i = (RelativeLayout) findViewById(C2706m.rl_layout);
        this.f9484j = (ImageView) findViewById(C2706m.iv_icon);
        this.f9485k = (TextView) findViewById(C2706m.tv_title);
        this.f9486l = (TextView) findViewById(C2706m.tv_duration);
        this.f9487m = (ImageView) findViewById(C2706m.iv_play);
        this.f9488n = (ImageView) findViewById(C2706m.iv_more);
    }

    /* renamed from: g */
    private final void m12528g(FragmentActivity fragmentActivity) {
        int i = 8;
        setVisibility(8);
        AudioPlayService instance = AudioPlayService.Companion.getInstance();
        if (instance != null) {
            setVisibility(instance.isAudioPlay() ? 0 : 8);
            RelativeLayout relativeLayout = this.f9481g;
            if (relativeLayout != null) {
                if (instance.isAudioPlay()) {
                    i = 0;
                }
                relativeLayout.setVisibility(i);
            }
            instance.addAudioPlayCallBack(new C2775a(this, instance, fragmentActivity));
            ImageView imageView = this.f9487m;
            if (imageView != null) {
                imageView.setOnClickListener(new C2776a(this, instance, fragmentActivity));
            }
            RelativeLayout relativeLayout2 = this.f9483i;
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new C2777b(instance));
            }
            ImageView imageView2 = this.f9488n;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new C2781f(this, fragmentActivity));
            }
            ImageView imageView3 = this.f9482h;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new C2780e(fragmentActivity, instance));
            }
            Video playingVideo = instance.playingVideo();
            if (playingVideo != null) {
                m12542v(!instance.isPlaying());
                m12541u(playingVideo.mo10565w(), playingVideo.mo10564v());
                m12543w(instance.playingTime(), playingVideo.mo10547g());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m12529h(AudioPlayBackItemView audioPlayBackItemView, AudioPlayService audioPlayService, FragmentActivity fragmentActivity, View view) {
        C8594l.m46771e(audioPlayBackItemView, "this$0");
        C8594l.m46771e(audioPlayService, "$this_apply");
        C8594l.m46771e(fragmentActivity, "$context");
        if (audioPlayBackItemView.f9489o) {
            audioPlayBackItemView.f9489o = false;
            audioPlayService.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_RESUME()));
            ImageView imageView = audioPlayBackItemView.f9487m;
            if (imageView != null) {
                imageView.setImageDrawable(C0506a.m3152d(fragmentActivity, C2705l.ic_audio_play));
                return;
            }
            return;
        }
        audioPlayBackItemView.f9489o = true;
        audioPlayService.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_PAUSE()));
        ImageView imageView2 = audioPlayBackItemView.f9487m;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C0506a.m3152d(fragmentActivity, C2705l.ic_audio_stop));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m12530i(AudioPlayService audioPlayService, View view) {
        C8594l.m46771e(audioPlayService, "$this_apply");
        audioPlayService.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_EXIT()));
        Intent intent = new Intent(audioPlayService.getApplicationContext(), VideoPlayerActivity.class);
        intent.addFlags(268435456);
        audioPlayService.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m12531j(AudioPlayBackItemView audioPlayBackItemView, FragmentActivity fragmentActivity, View view) {
        C8594l.m46771e(audioPlayBackItemView, "this$0");
        C8594l.m46771e(fragmentActivity, "$context");
        AudioPlayService instance = AudioPlayService.Companion.getInstance();
        if (instance != null) {
            C2749h.C2750a aVar = C2749h.f9425v0;
            C2749h b = C2749h.C2750a.m12420b(aVar, (ArrayList) instance.playingVideos(), (Video) null, instance.playingPosition(), instance.getPlayMode(), 2, (Object) null);
            audioPlayBackItemView.f9490p = b;
            if (b != null) {
                b.mo3841h3(fragmentActivity.mo3730H1(), aVar.mo10314c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m12532k(FragmentActivity fragmentActivity, AudioPlayService audioPlayService, View view) {
        C8594l.m46771e(fragmentActivity, "$context");
        C8594l.m46771e(audioPlayService, "$this_apply");
        C0133c.C0134a aVar = new C0133c.C0134a(fragmentActivity, C2709p.VideoTheme_Dialog_Dark);
        aVar.mo644o(C2708o.video_audio_mode);
        aVar.mo636g(C2708o.video_player_close_audio_tips);
        aVar.mo633d(true);
        aVar.mo641l(17039370, new C2778c(audioPlayService));
        aVar.mo638i(17039360, C2779d.f9504g);
        C0133c a = aVar.mo630a();
        C8594l.m46770d(a, "Builder(\n               …               }.create()");
        Window window = a.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new BitmapDrawable());
        }
        Window window2 = a.getWindow();
        WindowManager.LayoutParams attributes = window2 == null ? null : window2.getAttributes();
        if (attributes != null) {
            attributes.width = C2723c.m12315b(fragmentActivity) - 300;
        }
        Window window3 = a.getWindow();
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
        Window window4 = a.getWindow();
        if (window4 != null) {
            window4.setBackgroundDrawable(C0506a.m3152d(fragmentActivity, C2705l.video_drawable_dialog_show_tips_round));
        }
        a.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12533l(AudioPlayService audioPlayService, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(audioPlayService, "$this_apply");
        audioPlayService.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_RELEASE()));
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m12534m(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m12541u(String str, String str2) {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (!((Activity) context).isDestroyed()) {
            ImageView imageView = this.f9484j;
            if (imageView != null) {
                C1738j<Drawable> K0 = C1719b.m8597t(getContext()).mo7665u(str2).mo7636K0(0.1f);
                Context context2 = getContext();
                int i = C2705l.video_drawable_placeholder_cover;
                ((C1738j) ((C1738j) K0.mo8393k(C0506a.m3152d(context2, i))).mo8376a0(C0506a.m3152d(getContext(), i))).mo7645z0(imageView);
            }
            if (str == null) {
                TextView textView = this.f9485k;
                if (textView != null) {
                    textView.setText(BuildConfig.FLAVOR);
                }
                TextView textView2 = this.f9486l;
                if (textView2 != null) {
                    textView2.setText(BuildConfig.FLAVOR);
                }
                this.f9489o = true;
            } else {
                TextView textView3 = this.f9485k;
                if (textView3 != null) {
                    textView3.setText(str);
                }
            }
            ImageView imageView2 = this.f9487m;
            if (imageView2 != null) {
                imageView2.setImageDrawable(C0506a.m3152d(getContext(), this.f9489o ? C2705l.ic_audio_stop : C2705l.ic_audio_play));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m12542v(boolean z) {
        if (this.f9489o != z) {
            this.f9489o = z;
            ImageView imageView = this.f9487m;
            if (imageView != null) {
                imageView.setImageDrawable(C0506a.m3152d(getContext(), this.f9489o ? C2705l.ic_audio_stop : C2705l.ic_audio_play));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m12543w(String str, long j) {
        String str2 = str + '/' + new SimpleDateFormat(j >= 3600000 ? "HH:mm:ss" : "mm:ss", Locale.US).format(new Date(j));
        TextView textView = this.f9486l;
        if (textView != null) {
            textView.setText(str2);
        }
    }

    /* renamed from: t */
    public final void mo10357t(FragmentActivity fragmentActivity) {
        C8594l.m46771e(fragmentActivity, "context");
        m12528g(fragmentActivity);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayBackItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8594l.m46771e(context, "context");
        m12527f(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayBackItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8594l.m46771e(context, "context");
        m12527f(context);
    }
}
