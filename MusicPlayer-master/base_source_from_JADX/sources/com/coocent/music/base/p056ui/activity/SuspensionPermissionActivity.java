package com.coocent.music.base.p056ui.activity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4451e;
import p159f.p166c.p181e.p182a.p190b.p192i.C4461a;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.music.base.ui.activity.SuspensionPermissionActivity */
/* compiled from: SuspensionPermissionActivity.kt */
public final class SuspensionPermissionActivity extends AppCompatActivity implements View.OnClickListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    /* renamed from: C */
    public static final C2350a f8258C = new C2350a((C8589g) null);

    /* renamed from: A */
    private Handler f8259A = new Handler();

    /* renamed from: B */
    private int f8260B = 1027;

    /* renamed from: z */
    private VideoView f8261z;

    /* renamed from: com.coocent.music.base.ui.activity.SuspensionPermissionActivity$a */
    /* compiled from: SuspensionPermissionActivity.kt */
    public static final class C2350a {
        private C2350a() {
        }

        public /* synthetic */ C2350a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo9285a(Context context, int i) {
            C8594l.m46771e(context, "context");
            Intent intent = new Intent(context, SuspensionPermissionActivity.class);
            intent.putExtra("permissionType", i);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo9286b(Fragment fragment, int i) {
            C8594l.m46771e(fragment, "fragment");
            Activity activity = fragment.getActivity();
            if (activity != null) {
                Intent intent = new Intent(activity, SuspensionPermissionActivity.class);
                intent.putExtra("permissionType", i);
                fragment.startActivityForResult(intent, 1029);
            }
        }
    }

    /* renamed from: d2 */
    private final void m11109d2() {
        this.f8260B = getIntent().getIntExtra("permissionType", 1027);
    }

    /* renamed from: e2 */
    private final void m11110e2() {
        if (Build.VERSION.SDK_INT >= 26) {
            VideoView videoView = this.f8261z;
            if (videoView != null) {
                videoView.setAudioFocusRequest(0);
            } else {
                C8594l.m46783q("mVideoView");
                throw null;
            }
        }
        VideoView videoView2 = this.f8261z;
        if (videoView2 != null) {
            videoView2.setOnCompletionListener(this);
            VideoView videoView3 = this.f8261z;
            if (videoView3 != null) {
                videoView3.setOnPreparedListener(this);
                int i = C4451e.video_edge_player;
                int i2 = this.f8260B;
                if (i2 != 1027 && i2 == 1028) {
                    i = C4451e.video_desktop_lyrics;
                }
                Uri parse = Uri.parse("android.resource://" + getPackageName() + '/' + i);
                VideoView videoView4 = this.f8261z;
                if (videoView4 != null) {
                    videoView4.setVideoURI(parse);
                } else {
                    C8594l.m46783q("mVideoView");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoView");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoView");
            throw null;
        }
    }

    /* renamed from: g2 */
    private final void m11111g2() {
        ((TextView) findViewById(C4448b.tv_permission_cancel)).setOnClickListener(this);
        ((TextView) findViewById(C4448b.tv_permission_set)).setOnClickListener(this);
        View findViewById = findViewById(C4448b.video_view);
        C8594l.m46770d(findViewById, "findViewById(R.id.video_view)");
        this.f8261z = (VideoView) findViewById;
        ((ImageView) findViewById(C4448b.iv_permission_close)).setOnClickListener(this);
    }

    public void finish() {
        C4461a aVar = C4461a.f13041a;
        boolean b = C4461a.m19525b(this);
        Intent intent = new Intent();
        intent.putExtra("hasFloatWindowPermission", b);
        intent.putExtra("permissionType", this.f8260B);
        setResult(-1, intent);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            finish();
        }
    }

    public void onClick(View view) {
        C8594l.m46771e(view, "v");
        int id = view.getId();
        if (id == C4448b.tv_permission_cancel) {
            finish();
        } else if (id == C4448b.tv_permission_set) {
            C4461a aVar = C4461a.f13041a;
            C4461a.m19524a(this);
        } else if (id == C4448b.iv_permission_close) {
            finish();
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C8594l.m46771e(mediaPlayer, "mp");
        VideoView videoView = this.f8261z;
        if (videoView != null) {
            videoView.start();
        } else {
            C8594l.m46783q("mVideoView");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4449c.activity_suspension_permission);
        m11109d2();
        m11111g2();
        m11110e2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f8259A;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f8259A = null;
        }
        C4461a aVar = C4461a.f13041a;
        boolean b = C4461a.m19525b(this);
        Intent intent = new Intent(C8594l.m46777k(getPackageName(), "com.example.music.library.action.CANCEL_REQUEST_PERMISSION"));
        intent.putExtra("permissionType", this.f8260B);
        intent.putExtra("hasFloatWindowPermission", b);
        sendBroadcast(intent);
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        C8594l.m46771e(mediaPlayer, "mp");
        VideoView videoView = this.f8261z;
        if (videoView != null) {
            videoView.start();
        } else {
            C8594l.m46783q("mVideoView");
            throw null;
        }
    }
}
