package com.coocent.videoplayer.weidget.view;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.coocent.video.videoplayercore.service.AudioPlayService;

/* renamed from: com.coocent.videoplayer.weidget.view.e */
/* compiled from: lambda */
public final /* synthetic */ class C2780e implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ FragmentActivity f9505g;

    /* renamed from: h */
    public final /* synthetic */ AudioPlayService f9506h;

    public /* synthetic */ C2780e(FragmentActivity fragmentActivity, AudioPlayService audioPlayService) {
        this.f9505g = fragmentActivity;
        this.f9506h = audioPlayService;
    }

    public final void onClick(View view) {
        AudioPlayBackItemView.m12532k(this.f9505g, this.f9506h, view);
    }
}
