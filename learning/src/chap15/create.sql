create table Apartments (
    AptID int(10) AUTO_INCREMENT,
    UnitNumber varchar(50),
    BuildingID int(10),
    PRIMARY KEY(AptID)
);

create table Tenants (
    TenantID int(10) AUTO_INCREMENT,
    TenantName varchar(50),
    PRIMARY KEY(TenantID)
);


create table AptTenants (
    TenantID int(10),
    AptID int(10)
);
