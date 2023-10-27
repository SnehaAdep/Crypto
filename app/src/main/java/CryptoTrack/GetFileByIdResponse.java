package CryptoTrack;

import java.util.ArrayList;
import java.util.Date;

public class GetFileByIdResponse {
    public String id;
    public String name;
    public String symbol;
    public Parent parent;
    public int rank;
    public boolean is_new;
    public boolean is_active;
    public String type;
    public String logo;
    public ArrayList<Tag> tags;
    public ArrayList<Team> team;
    public String description;
    public String message;
    public boolean open_source;
    public boolean hardware_wallet;
    public Date started_at;
    public String development_status;
    public String proof_type;
    public String org_structure;
    public String hash_algorithm;
    public String contract;
    public String platform;
    public ArrayList<Contract> contracts;
    public Links links;
    public ArrayList<LinksExtended> links_extended;
    public Whitepaper whitepaper;
    public Date first_data_at;
    public Date last_data_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isIs_new() {
        return is_new;
    }

    public void setIs_new(boolean is_new) {
        this.is_new = is_new;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        this.team = team;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOpen_source() {
        return open_source;
    }

    public void setOpen_source(boolean open_source) {
        this.open_source = open_source;
    }

    public boolean isHardware_wallet() {
        return hardware_wallet;
    }

    public void setHardware_wallet(boolean hardware_wallet) {
        this.hardware_wallet = hardware_wallet;
    }

    public Date getStarted_at() {
        return started_at;
    }

    public void setStarted_at(Date started_at) {
        this.started_at = started_at;
    }

    public String getDevelopment_status() {
        return development_status;
    }

    public void setDevelopment_status(String development_status) {
        this.development_status = development_status;
    }

    public String getProof_type() {
        return proof_type;
    }

    public void setProof_type(String proof_type) {
        this.proof_type = proof_type;
    }

    public String getOrg_structure() {
        return org_structure;
    }

    public void setOrg_structure(String org_structure) {
        this.org_structure = org_structure;
    }

    public String getHash_algorithm() {
        return hash_algorithm;
    }

    public void setHash_algorithm(String hash_algorithm) {
        this.hash_algorithm = hash_algorithm;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<Contract> contracts) {
        this.contracts = contracts;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public ArrayList<LinksExtended> getLinks_extended() {
        return links_extended;
    }

    public void setLinks_extended(ArrayList<LinksExtended> links_extended) {
        this.links_extended = links_extended;
    }

    public Whitepaper getWhitepaper() {
        return whitepaper;
    }

    public void setWhitepaper(Whitepaper whitepaper) {
        this.whitepaper = whitepaper;
    }

    public Date getFirst_data_at() {
        return first_data_at;
    }

    public void setFirst_data_at(Date first_data_at) {
        this.first_data_at = first_data_at;
    }

    public Date getLast_data_at() {
        return last_data_at;
    }

    public void setLast_data_at(Date last_data_at) {
        this.last_data_at = last_data_at;
    }
}

