package coocent.music.player.widget.desktop;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class CurrentPlaylistWidgetService extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C7184a(getApplicationContext(), intent);
    }
}
