package net.consensys.liszt.accountmanager;

import java.util.List;
import net.consensys.liszt.core.common.RTransfer;
import net.consensys.liszt.core.crypto.Hash;
import net.consensys.liszt.core.crypto.PublicKey;

public interface AccountService {

  /** @return true if the transfer is valid, eg. the account exists. */
  boolean checkBasicValidity(RTransfer transfer, Hash fatherRootHash);

  /**
   * Update the state if all submitted transfer are valid, otherwise return list of invalid
   * transfers
   */
  List<RTransfer> updateIfAllTransfersValid(List<RTransfer> transfers, Hash fatherRootHash);

  /** @return last accepted merkle root hash of the account tree */
  Hash getLastAcceptedRootHash();

  /** @return account for a given user */
  Account getAccount(PublicKey owner, Hash rootHash);
}
