package org.proninyaroslav.libretorrent.core.model.stream;

import org.proninyaroslav.libretorrent.core.utils.Utils;

public class StreamDetails {

    public String id;
    public String torrentId;
    public int selectedFileIndex;
    public int firstFilePiece, lastFilePiece;
    /* The last piece may be smaller than the rest

     */


    public int lastFilePieceSize;
    public long fileOffset, fileSize;
    public int pieceLength;


    public StreamDetails(String torrentId, int selectedFileIndex, int firstFilePiece,
                         int lastFilePiece, int pieceLength, long fileOffset,
                         long fileSize, int lastFilePieceSize)
    {
        this.id = Utils.makeSha1Hash(torrentId + selectedFileIndex);
        this.torrentId = torrentId;
        this.lastFilePiece = lastFilePiece;
        this.firstFilePiece = firstFilePiece;
        this.pieceLength = pieceLength;
        this.selectedFileIndex = selectedFileIndex;
        this.fileOffset = fileOffset;
        this.fileSize = fileSize;
        this.lastFilePieceSize = lastFilePieceSize;
    }
}
