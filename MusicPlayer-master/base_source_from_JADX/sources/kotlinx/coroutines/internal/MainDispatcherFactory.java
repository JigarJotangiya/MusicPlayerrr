package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C8874l2;

/* compiled from: MainDispatcherFactory.kt */
public interface MainDispatcherFactory {
    C8874l2 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
