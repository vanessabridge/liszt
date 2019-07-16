package net.consensys.liszt.transactionmanager;

import java.util.List;

public class RTransferState {
  public final RTransfer transfer;

  /**
   * The states of all batches that included this transfer, as known by the operator. Most of the
   * time there should be only one such state.
   */
  public final List<BatchState> batchStates;

  public RTransferState(RTransfer transfer, List<BatchState> batchStates) {
    this.transfer = transfer;
    this.batchStates = batchStates;
  }
}
