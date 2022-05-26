package com.coocent.videolibrary.p058ui.folder;

import androidx.lifecycle.C0672f0;
import androidx.lifecycle.LiveData;
import com.coocent.videolibrary.p058ui.folder.C2611l;
import java.util.List;

/* renamed from: com.coocent.videolibrary.ui.folder.g */
/* compiled from: lambda */
public final /* synthetic */ class C2600g implements C0672f0 {

    /* renamed from: a */
    public final /* synthetic */ C2611l f9044a;

    /* renamed from: b */
    public final /* synthetic */ LiveData f9045b;

    public /* synthetic */ C2600g(C2611l lVar, LiveData liveData) {
        this.f9044a = lVar;
        this.f9045b = liveData;
    }

    public final void onChanged(Object obj) {
        C2611l.C2615d.m12013f(this.f9044a, this.f9045b, (List) obj);
    }
}
