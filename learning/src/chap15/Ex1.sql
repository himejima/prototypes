SELECT count(*), t.TenantID, t.TenantName FROM Tenants AS t
INNER JOIN AptTenants AS at ON t.TenantID = at.TenantID
INNER JOIN Apartments AS a ON a.AptID = at.AptID
GROUP BY t.TenantID having count(*) >= 2;
