package com.rapleaf.hank.coordinator;

import com.rapleaf.hank.config.DomainConfig;
import com.rapleaf.hank.config.DomainGroupConfig;
import com.rapleaf.hank.config.PartDaemonAddress;
import com.rapleaf.hank.config.RingConfig;
import com.rapleaf.hank.config.RingGroupConfig;
import com.rapleaf.hank.exception.DataNotFoundException;

public class MockCoordinator implements Coordinator {

  @Override
  public void addDaemonStateChangeListener(String ringGroupName,
      int ringNumber, PartDaemonAddress hostAddress, DaemonType type,
      DaemonStateChangeListener listener) {
    // TODO Auto-generated method stub

  }

  @Override
  public void addDomainChangeListener(String domainName,
      DomainChangeListener listener) throws DataNotFoundException {
    // TODO Auto-generated method stub

  }

  @Override
  public void addDomainGroupChangeListener(String domainGroupName,
      DomainGroupChangeListener listener) throws DataNotFoundException {
    // TODO Auto-generated method stub

  }

  @Override
  public void addRingGroupChangeListener(String ringGroupName,
      RingGroupChangeListener listener) throws DataNotFoundException {
    // TODO Auto-generated method stub

  }

  @Override
  public DaemonState getDaemonState(String ringGroupName, int ringNumber,
      PartDaemonAddress hostAddress, DaemonType type) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DomainConfig getDomainConfig(String domainName)
      throws DataNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DomainGroupConfig getDomainGroupConfig(String domainGroupName)
      throws DataNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RingConfig getRingConfig(String ringGroupName, int ringNumber)
      throws DataNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RingGroupConfig getRingGroupConfig(String ringGroupName)
      throws DataNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setDaemonState(String ringGroupName, int ringNumber,
      PartDaemonAddress hostAddress, DaemonType type, DaemonState state) {
    // TODO Auto-generated method stub

  }

  @Override
  public int updateDomain(String domainName) throws DataNotFoundException {
    // TODO Auto-generated method stub
    return 0;
  }

}
