package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7056a;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8321j;

public class ArtWorkAdapter extends BaseQuickAdapter<C7056a, BaseViewHolder> {
    public ArtWorkAdapter(int i, List<C7056a> list) {
        super(i, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7056a aVar) {
        C8321j.m45996b(aVar.mo27067a(), R.drawable.homepage_album_cover_default, (ImageView) baseViewHolder.getView(R.id.artwork_image));
    }
}
