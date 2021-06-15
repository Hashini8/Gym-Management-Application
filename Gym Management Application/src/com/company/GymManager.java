package com.company;

import java.util.List;

public interface GymManager {

    void addMember(DefaultMember member);

    public void deleteMember(String membershipNo);
    public void printListofMember();
    public void sort();
    public void save();
    public List<DefaultMember> getMemberList();
    public DefaultMember getMemberbyMembershipNo (String membershipNo);
    public DefaultMember[] getMemberbyName (String name);

}
