package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import p369i.C8447l;
import p369i.C8450m;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.android.c */
/* compiled from: HandlerDispatcher.kt */
public final class C8673c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C8672b bVar = null;
        try {
            C8447l.C8448a aVar = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(new C8669a(m47087a(Looper.getMainLooper(), true), (String) null, 2, (C8589g) null));
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(C8450m.m46574a(th));
        }
        if (!C8447l.m50331isFailureimpl(obj)) {
            bVar = obj;
        }
        C8672b bVar2 = bVar;
    }

    /* renamed from: a */
    public static final Handler m47087a(Looper looper, boolean z) {
        int i;
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
