package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p369i.p387z.p389d.C8589g;

/* compiled from: HandlerDispatcher.kt */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public C8669a createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new C8669a(C8673c.m47087a(Looper.getMainLooper(), true), (String) null, 2, (C8589g) null);
    }
}
