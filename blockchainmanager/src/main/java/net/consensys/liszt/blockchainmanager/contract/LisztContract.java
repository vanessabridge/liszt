package net.consensys.liszt.blockchainmanager.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * Auto generated code.
 *
 * <p><strong>Do not modify!</strong>
 *
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the <a
 * href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.3.0.
 */
public class LisztContract extends Contract {
  private static final String BINARY =
      "608060405234801561001057600080fd5b50610eaa806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80630d6396cb1461006757806310d44e6b146101a3578063184a08ee146101c95780633dc2abd91461041957806349e257b1146105675780635474a0541461058b575b600080fd5b6101a1600480360360a081101561007d57600080fd5b810190602081018135600160201b81111561009757600080fd5b8201836020820111156100a957600080fd5b803590602001918460018302840111600160201b831117156100ca57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561011c57600080fd5b82018360208201111561012e57600080fd5b803590602001918460018302840111600160201b8311171561014f57600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955050823593505060ff6020830135811692604001351690506106c5565b005b6101a1600480360360208110156101b957600080fd5b50356001600160a01b03166107b9565b6101a160048036036101008110156101e057600080fd5b810190602081018135600160201b8111156101fa57600080fd5b82018360208201111561020c57600080fd5b803590602001918460018302840111600160201b8311171561022d57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561027f57600080fd5b82018360208201111561029157600080fd5b803590602001918460018302840111600160201b831117156102b257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929560ff853516959094909350604081019250602001359050600160201b81111561030f57600080fd5b82018360208201111561032157600080fd5b803590602001918460018302840111600160201b8311171561034257600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561039457600080fd5b8201836020820111156103a657600080fd5b803590602001918460018302840111600160201b831117156103c757600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955050823593505060ff6020830135811692604001351690506107db565b610553600480360360a081101561042f57600080fd5b810190602081018135600160201b81111561044957600080fd5b82018360208201111561045b57600080fd5b803590602001918460018302840111600160201b8311171561047c57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b8111156104ce57600080fd5b8201836020820111156104e057600080fd5b803590602001918460018302840111600160201b8311171561050157600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955050823593505060ff602083013581169260400135169050610acd565b604080519115158252519081900360200190f35b61056f610b38565b604080516001600160a01b039092168252519081900360200190f35b610553600480360360a08110156105a157600080fd5b810190602081018135600160201b8111156105bb57600080fd5b8201836020820111156105cd57600080fd5b803590602001918460018302840111600160201b831117156105ee57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561064057600080fd5b82018360208201111561065257600080fd5b803590602001918460018302840111600160201b8311171561067357600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955050823593505060ff602083013581169260400135169050610b47565b8060ff168260ff16146107b2576106da610d65565b506040805160c081018252848152602081018790529081018590526001606082015260ff8084166080830152821660a0820152600061071882610c66565b6000818152600160208181526040909220855181558286015180519495508694919361074993850192910190610da3565b5060408201518051610765916002840191602090910190610da3565b5060608201516003919091018054608084015160a09094015160ff199091169215159290921761ff00191661010060ff948516021762ff0000191662010000939092169290920217905550505b5050505050565b600080546001600160a01b0319166001600160a01b0392909216919091179055565b60008060009054906101000a90046001600160a01b03166001600160a01b0316635474a05487878787876040518663ffffffff1660e01b81526004018080602001806020018681526020018560ff1660ff1681526020018460ff1660ff168152602001838103835288818151815260200191508051906020019080838360005b8381101561087357818101518382015260200161085b565b50505050905090810190601f1680156108a05780820380516001836020036101000a031916815260200191505b50838103825287518152875160209182019189019080838360005b838110156108d35781810151838201526020016108bb565b50505050905090810190601f1680156109005780820380516001836020036101000a031916815260200191505b5097505050505050505060206040518083038186803b15801561092257600080fd5b505afa158015610936573d6000803e3d6000fd5b505050506040513d602081101561094c57600080fd5b505190508015610ac25761095e610d65565b506040805160c081018252858152602081018890529081018690526001606082015260ff8085166080830152831660a0820152600061099c82610c66565b90506109a6610e21565b506040805160a0810182528c815260208082018d905260ff8c168284015260016060830152608082018590526000848152600282529290922081518051929384936109f49284920190610da3565b506020828101518051610a0d9260018501920190610da3565b5060408201516002820155606082015160038201805460ff191691151591909117905560808201518051600483019081556020808301518051610a569260058701920190610da3565b5060408201518051610a72916002840191602090910190610da3565b5060608201516003919091018054608084015160a09094015160ff199091169215159290921761ff00191661010060ff948516021762ff0000191662010000939092169290920217905550505050505b505050505050505050565b6000610ad7610d65565b506040805160c081018252858152602081018890529081018690526001606082015260ff8085166080830152831660a08201526000610b1582610c66565b60009081526002602052604090206003015460ff16925050505b95945050505050565b6000546001600160a01b031681565b60008084878786866040516020018086815260200185805190602001908083835b60208310610b875780518252601f199092019160209182019101610b68565b51815160209384036101000a600019018019909216911617905287519190930192870191508083835b60208310610bcf5780518252601f199092019160209182019101610bb0565b51815160001960209485036101000a019081169019919091161790526001600160f81b031960f897881b8116949092019384529490951b90941660018281019190915260408051601d198185030181526002909301815282519285019290922060008181529190945220600301549196505060ff16159350610c5992505050576001915050610b2f565b5060009695505050505050565b60008082600001518360200151846040015185608001518660a001516040516020018086815260200185805190602001908083835b60208310610cba5780518252601f199092019160209182019101610c9b565b51815160209384036101000a600019018019909216911617905287519190930192870191508083835b60208310610d025780518252601f199092019160209182019101610ce3565b51815160209384036101000a600019018019909216911617905260f896871b6001600160f81b0319908116929094019182529490951b9091166001850152505060408051808403601d190181526002909301905281519101209695505050505050565b6040518060c00160405280600081526020016060815260200160608152602001600015158152602001600060ff168152602001600060ff1681525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610de457805160ff1916838001178555610e11565b82800160010185558215610e11579182015b82811115610e11578251825591602001919060010190610df6565b50610e1d929150610e58565b5090565b604051806101400160405280606081526020016060815260200160008152602001600015158152602001610e53610d65565b905290565b610e7291905b80821115610e1d5760008155600101610e5e565b9056fea265627a7a72305820a378d73045ace82a83b91fe9b6561da8b74882c509f6ecfe3650265c341e23e764736f6c63430005090032";

  public static final String FUNC_UPDATELOCKDONE = "updateLockDone";

  public static final String FUNC_SETLISZTADDRESS = "setLisztAddress";

  public static final String FUNC_UPDATETRANSFERDONE = "updateTransferDone";

  public static final String FUNC_TRANSFERDONECONTAINS = "transferDoneContains";

  public static final String FUNC_LISZT = "liszt";

  public static final String FUNC_LOCKDONECONTAINS = "lockDoneContains";

  @Deprecated
  protected LisztContract(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected LisztContract(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected LisztContract(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected LisztContract(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteCall<TransactionReceipt> updateLockDone(
      String from,
      String to,
      BigInteger amount,
      BigInteger sourceRollupId,
      BigInteger targetRollupId) {
    final Function function =
        new Function(
            FUNC_UPDATELOCKDONE,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.Utf8String(from),
                new org.web3j.abi.datatypes.Utf8String(to),
                new org.web3j.abi.datatypes.generated.Uint256(amount),
                new org.web3j.abi.datatypes.generated.Uint8(sourceRollupId),
                new org.web3j.abi.datatypes.generated.Uint8(targetRollupId)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteCall<TransactionReceipt> setLisztAddress(String addr) {
    final Function function =
        new Function(
            FUNC_SETLISZTADDRESS,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(addr)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteCall<TransactionReceipt> updateTransferDone(
      String from,
      String to,
      BigInteger amount,
      String otherFrom,
      String otherTo,
      BigInteger otherAmount,
      BigInteger otherSourceRollupId,
      BigInteger otherTargetRollupId) {
    final Function function =
        new Function(
            FUNC_UPDATETRANSFERDONE,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.Utf8String(from),
                new org.web3j.abi.datatypes.Utf8String(to),
                new org.web3j.abi.datatypes.generated.Uint8(amount),
                new org.web3j.abi.datatypes.Utf8String(otherFrom),
                new org.web3j.abi.datatypes.Utf8String(otherTo),
                new org.web3j.abi.datatypes.generated.Uint256(otherAmount),
                new org.web3j.abi.datatypes.generated.Uint8(otherSourceRollupId),
                new org.web3j.abi.datatypes.generated.Uint8(otherTargetRollupId)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteCall<Boolean> transferDoneContains(
      String otherFrom,
      String otherTo,
      BigInteger otherAmount,
      BigInteger otherSourceRollupId,
      BigInteger otherTargetRollupId) {
    final Function function =
        new Function(
            FUNC_TRANSFERDONECONTAINS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.Utf8String(otherFrom),
                new org.web3j.abi.datatypes.Utf8String(otherTo),
                new org.web3j.abi.datatypes.generated.Uint256(otherAmount),
                new org.web3j.abi.datatypes.generated.Uint8(otherSourceRollupId),
                new org.web3j.abi.datatypes.generated.Uint8(otherTargetRollupId)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteCall<String> liszt() {
    final Function function =
        new Function(
            FUNC_LISZT,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    return executeRemoteCallSingleValueReturn(function, String.class);
  }

  public RemoteCall<Boolean> lockDoneContains(
      String from,
      String to,
      BigInteger amount,
      BigInteger sourceRollupId,
      BigInteger targetRollupId) {
    final Function function =
        new Function(
            FUNC_LOCKDONECONTAINS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.Utf8String(from),
                new org.web3j.abi.datatypes.Utf8String(to),
                new org.web3j.abi.datatypes.generated.Uint256(amount),
                new org.web3j.abi.datatypes.generated.Uint8(sourceRollupId),
                new org.web3j.abi.datatypes.generated.Uint8(targetRollupId)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  @Deprecated
  public static LisztContract load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new LisztContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static LisztContract load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new LisztContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static LisztContract load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new LisztContract(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static LisztContract load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new LisztContract(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<LisztContract> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        LisztContract.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<LisztContract> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        LisztContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<LisztContract> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        LisztContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<LisztContract> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        LisztContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }
}