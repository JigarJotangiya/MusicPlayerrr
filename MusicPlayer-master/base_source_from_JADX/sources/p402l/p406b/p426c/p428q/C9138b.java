package p402l.p406b.p426c.p428q;

import java.util.HashMap;
import java.util.Map;
import p402l.p406b.p407a.p409f.p410c.C8972f;

/* renamed from: l.b.c.q.b */
/* compiled from: AsfFieldKey */
public enum C9138b {
    AUTHOR("AUTHOR", false, r13),
    TITLE("TITLE", false, r12),
    RATING("RATING", false, r12),
    COPYRIGHT("COPYRIGHT", false, r12),
    DESCRIPTION("DESCRIPTION", false, r12),
    BANNER_IMAGE("BANNER_IMAGE", false, r12),
    BANNER_IMAGE_TYPE("BANNER_IMAGE_TYPE", false, r11),
    BANNER_IMAGE_URL("BANNER_IMAGE_URL", false, r11),
    COPYRIGHT_URL("COPYRIGHT_URL", false, r11),
    ALBUM("WM/AlbumTitle", false),
    ALBUM_ARTIST("WM/AlbumArtist", true),
    ALBUM_ARTIST_SORT("WM/AlbumArtistSortOrder", false),
    ALBUM_SORT("WM/AlbumSortOrder", false),
    AMAZON_ID("ASIN", false),
    ARTIST_SORT("WM/ArtistSortOrder", false),
    ARTISTS("WM/ARTISTS", true),
    BARCODE("WM/Barcode", false),
    BPM("WM/BeatsPerMinute", false),
    CATALOG_NO("WM/CatalogNo", false),
    CATEGORY("WM/Category", true),
    COMPOSER("WM/Composer", true),
    COMPOSER_SORT("WM/ComposerSort", false),
    CONDUCTOR("WM/Conductor", true),
    COVER_ART("WM/Picture", true),
    COVER_ART_URL("WM/AlbumCoverURL", true),
    CUSTOM1("CUSTOM1", true),
    CUSTOM2("CUSTOM2", true),
    CUSTOM3("CUSTOM3", true),
    CUSTOM4("CUSTOM4", true),
    CUSTOM5("CUSTOM5", true),
    DIRECTOR("WM/Director", true),
    DISC_NO("WM/PartOfSet", false),
    DISC_SUBTITLE("WM/SetSubTitle", false),
    DISC_TOTAL("WM/DiscTotal", false),
    ENCODER("WM/ToolName", false),
    ENCODED_BY("WM/EncodedBy", false),
    FBPM("FBPM", true),
    GENRE("WM/Genre", true),
    GENRE_ID("WM/GenreID", true),
    GROUPING("WM/ContentGroupDescription", false),
    INITIAL_KEY("WM/InitialKey", false),
    IS_COMPILATION("WM/IsCompilation", false),
    ISRC("WM/ISRC", false),
    ISVBR("IsVBR", true),
    LANGUAGE("WM/Language", true),
    LYRICIST("WM/Writer", true),
    LYRICS("WM/Lyrics", false),
    LYRICS_SYNCHRONISED("WM/Lyrics_Synchronised", true),
    MEDIA("WM/Media", false),
    MOOD("WM/Mood", true),
    MUSICBRAINZ_ARTISTID("MusicBrainz/Artist Id", false),
    MUSICBRAINZ_DISC_ID("MusicBrainz/Disc Id", false),
    MUSICBRAINZ_ORIGINAL_RELEASEID("MusicBrainz/Original Album Id", false),
    MUSICBRAINZ_RELEASE_COUNTRY("MusicBrainz/Album Release Country", false),
    MUSICBRAINZ_RELEASE_STATUS("MusicBrainz/Album Status", false),
    MUSICBRAINZ_RELEASE_TYPE("MusicBrainz/Album Type", false),
    MUSICBRAINZ_RELEASEARTISTID("MusicBrainz/Album Artist Id", false),
    MUSICBRAINZ_RELEASEID("MusicBrainz/Album Id", false),
    MUSICBRAINZ_RELEASEGROUPID("MusicBrainz/Release Group Id", false),
    MUSICBRAINZ_RELEASETRACKID("MusicBrainz/Release Track Id", false),
    MUSICBRAINZ_TRACK_ID("MusicBrainz/Track Id", false),
    MUSICBRAINZ_WORKID("MusicBrainz/Work Id", false),
    MUSICIP_ID("MusicIP/PUID", false),
    ACOUSTID_FINGERPRINT("Acoustid/Fingerprint", false),
    ACOUSTID_FINGERPRINT_OLD("AcoustId/Fingerprint", false),
    ACOUSTID_ID("Acoustid/Id", false),
    OCCASION("Occasion", true),
    ORIGINAL_ALBUM("WM/OriginalAlbumTitle", true),
    ORIGINAL_ARTIST("WM/OriginalArtist", true),
    ORIGINAL_LYRICIST("WM/OriginalLyricist", true),
    ORIGINAL_YEAR("WM/OriginalReleaseYear", true),
    PRODUCER("WM/Producer", false),
    QUALITY("Quality", true),
    USER_RATING("WM/SharedUserRating", true),
    MM_RATING("SDB/Rating", true),
    RECORD_LABEL("WM/Publisher", false),
    REMIXER("WM/ModifiedBy", false),
    SCRIPT("WM/Script", false),
    SUBTITLE("WM/SubTitle", false),
    TAGS("WM/Tags", false),
    TEMPO("Tempo", true),
    TITLE_SORT("WM/TitleSortOrder", false),
    TRACK("WM/TrackNumber", false),
    TRACK_TOTAL("WM/TrackTotal", false),
    URL_DISCOGS_ARTIST_SITE("WM/DiscogsArtistUrl", false),
    URL_DISCOGS_RELEASE_SITE("WM/DiscogsReleaseUrl", false),
    URL_OFFICIAL_ARTIST_SITE("WM/AuthorURL", false),
    URL_OFFICIAL_RELEASE_SITE("WM/OfficialReleaseUrl", false),
    URL_PROMOTIONAL_SITE("WM/PromotionURL", true),
    URL_WIKIPEDIA_ARTIST_SITE("WM/WikipediaArtistUrl", false),
    URL_WIKIPEDIA_RELEASE_SITE("WM/WikipediaReleaseUrl", false),
    URL_LYRICS_SITE("WM/LyricsUrl", false),
    YEAR("WM/Year", false),
    ENGINEER("WM/Engineer", false),
    DJMIXER("WM/DJMixer", false),
    MIXER("WM/Mixer", false),
    ARRANGER("WM/Arranger", false),
    COUNTRY("WM/Country", false),
    CUSTOM("___CUSTOM___", true);
    

    /* renamed from: g */
    private static final Map<String, C9138b> f35760g = null;
    private final String fieldName;
    private final C8972f highestContainer;
    private final C8972f lowestContainer;
    private final boolean multiValued;

    static {
        int i;
        f35760g = new HashMap(values().length);
        for (C9138b bVar : values()) {
            if (bVar != CUSTOM) {
                f35760g.put(bVar.getFieldName(), bVar);
            }
        }
    }

    private C9138b(String str, boolean z) {
        this(r8, r9, str, z, C8972f.EXTENDED_CONTENT, C8972f.METADATA_LIBRARY_OBJECT);
    }

    public static C9138b getAsfFieldKey(String str) {
        C9138b bVar = f35760g.get(str);
        return bVar == null ? CUSTOM : bVar;
    }

    public static boolean isMultiValued(String str) {
        C9138b asfFieldKey = getAsfFieldKey(str);
        return asfFieldKey != null && asfFieldKey.isMultiValued();
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public C8972f getHighestContainer() {
        return this.highestContainer;
    }

    public C8972f getLowestContainer() {
        return this.lowestContainer;
    }

    public String toString() {
        return getFieldName();
    }

    private C9138b(String str, boolean z, C8972f fVar) {
        this(r8, r9, str, z, fVar, fVar);
    }

    private C9138b(String str, boolean z, C8972f fVar, C8972f fVar2) {
        this.fieldName = str;
        this.multiValued = z && fVar2.isMultiValued();
        this.lowestContainer = fVar;
        this.highestContainer = fVar2;
    }

    public boolean isMultiValued() {
        return this.multiValued;
    }
}
