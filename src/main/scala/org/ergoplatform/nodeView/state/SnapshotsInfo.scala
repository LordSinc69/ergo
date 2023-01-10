package org.ergoplatform.nodeView.state

import org.ergoplatform.ErgoLikeContext.Height
import org.ergoplatform.nodeView.state.UtxoState.ManifestId

/**
  * Container for available UTXO set snapshots
  * @param availableManifests - available UTXO set snapshot manifests and corresponding heights
  */
case class SnapshotsInfo(availableManifests: Map[Height, ManifestId]) {
  def withNewManifest(height: Height, manifestId: ManifestId): SnapshotsInfo = {
    SnapshotsInfo(availableManifests.updated(height, manifestId))
  }

  def nonEmpty: Boolean = availableManifests.nonEmpty
}

object SnapshotsInfo {

  def makeEmpty(): SnapshotsInfo = SnapshotsInfo(Map.empty)

}




